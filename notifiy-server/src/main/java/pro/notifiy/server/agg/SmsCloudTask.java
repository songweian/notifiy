package pro.notifiy.server.agg;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class SmsCloudTask {
    private String cloudTaskId;

    private List<CloudTaskDetail> cloudTaskDetails;

    public static class CloudTaskDetail {
        private String templateCode;

        private List<String> taskId;
    }
}
