package pro.notifiy.server.api.vo;

import lombok.Data;
import pro.notifiy.server.model.TargetType;

import java.util.List;
import java.util.Map;

@Data
public class SendRequest {
    private String templateCode;
    private Map<String, String> contentParams;
    private TargetType targetType;
    private List<String> targetList;
}
