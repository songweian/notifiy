package pro.notifiy.server.core;

public sealed interface Result {

    final class Some<T> implements Result {
        public final T value;

        public Some(T value) {
            this.value = value;
        }

        public T val() {
            return value;
        }
    }

    final class None<T> implements Result {

        private static final None<?> INSTANCE = new None<>();

        public None() {
        }
    }

    static <T> Some<T> some(T value) {
        return new Some<>(value);
    }


    static <T> None<T> none() {
        //noinspection unchecked
        return (None<T>) None.INSTANCE;
    }
}

