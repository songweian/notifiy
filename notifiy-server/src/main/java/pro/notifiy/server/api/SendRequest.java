package pro.notifiy.server.api;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SendRequest {
    private String templateCode;
    private Map<String, String> contentParams;
    private TargetType targetType;
    private List<String> targetList;
}
