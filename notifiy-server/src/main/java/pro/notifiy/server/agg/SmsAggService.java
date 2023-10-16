package pro.notifiy.server.agg;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pro.notifiy.server.channel.ChannelInfo;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class SmsAggService {


    private List<SmsCloudTask> convert(List<SmsLocalTask> list, List<ChannelInfo> channelInfo) {
        return null;
    }

}
