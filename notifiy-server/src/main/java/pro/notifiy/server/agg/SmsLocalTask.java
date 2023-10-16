package pro.notifiy.server.agg;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SmsLocalTask {
    private String taskId;
    private String templateCode;
    private String target;
    private String targetType;
}
