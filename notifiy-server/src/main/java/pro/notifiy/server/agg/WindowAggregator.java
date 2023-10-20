package pro.notifiy.server.agg;

import com.lmax.disruptor.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WindowAggregator {
    private final RingBuffer<DataEvent> ringBuffer;
    private final int windowSize;
    private final long windowDuration;
    private final List<Window> windows = new ArrayList<>();
    private long lastWindowStartTime = 0;

    public WindowAggregator(int bufferSize, int windowSize, long windowDuration) {
        this.ringBuffer = RingBuffer.createSingleProducer(DataEvent::new, bufferSize, new YieldingWaitStrategy());
        this.windowSize = windowSize;
        this.windowDuration = windowDuration;
        for (int i = 0; i < bufferSize; i += windowSize) {
            windows.add(new Window(i, i + windowSize));
        }
    }

    public void start() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        SequenceBarrier barrier = ringBuffer.newBarrier();
        BatchEventProcessor<DataEvent> processor = new BatchEventProcessor<>(ringBuffer, barrier, this::processEvents);
//        BatchEventProcessor<DataEvent> processor = new BatchEventProcessorBuilder()
//                .setMaxBatchSize(100)
//                .build(() -> barrier, barrier, null);
        ringBuffer.addGatingSequences(processor.getSequence());
        executor.submit(processor);
    }

    public void addData(long timestamp, double value) {
        long sequence = ringBuffer.next();
        try {
            DataEvent event = ringBuffer.get(sequence);
            event.setTimestamp(timestamp);
            event.setValue(value);
        } finally {
            ringBuffer.publish(sequence);
        }
    }

    private void processEvents(DataEvent[] events, long sequence, boolean endOfBatch) {
        for (DataEvent event : events) {
            long timestamp = event.getTimestamp();
            if (timestamp < lastWindowStartTime) {
                continue;
            }
            int windowIndex = (int) ((timestamp - lastWindowStartTime) / windowDuration);
            if (windowIndex >= windows.size()) {
                continue;
            }
            Window window = windows.get(windowIndex);
            window.addValue(event.getValue());
            if (window.isFull()) {
                System.out.println("Window " + window.getStart() + "-" + window.getEnd() + ": " + window.getSum());
                lastWindowStartTime = window.getEnd();
            }
        }
    }

    private static class DataEvent {
        private long timestamp;
        private double value;

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }
    }

    private static class Window {
        private final int start;
        private final int end;
        private final double[] values;
        private int count = 0;
        private double sum = 0;

        public Window(int start, int end) {
            this.start = start;
            this.end = end;
            this.values = new double[end - start];
        }

        public void addValue(double value) {
            values[count++] = value;
            sum += value;
        }

        public boolean isFull() {
            return count == values.length;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        public double getSum() {
            return sum;
        }
    }
}
