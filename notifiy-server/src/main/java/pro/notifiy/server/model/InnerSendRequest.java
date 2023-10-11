package pro.notifiy.server.model;

import lombok.Data;
import org.springframework.beans.BeanUtils;
import pro.notifiy.server.api.vo.SendRequest;

import java.util.List;
import java.util.Map;

@Data
public class InnerSendRequest {
    private String templateCode;
    private Map<String, String> contentParams;
    private TargetType targetType;
    private List<String> targetList;

    public static InnerSendRequest from(SendRequest request) {
        InnerSendRequest r = new InnerSendRequest();
        BeanUtils.copyProperties(request, r);
        return r;
    }
}
