package pro.notifiy.server.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pro.notifiy.server.api.SendRequest;
import pro.notifiy.server.api.SendResult;
import pro.notifiy.server.api.TargetType;
import pro.notifiy.server.channel.UnionChannelSendService;
import pro.notifiy.server.core.R;

import java.util.List;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Service
public class UnionSendService {
    private UnionChannelSendService unionChannelSendService;

    public R<SendResult> send(SendRequest request) {
        String templateCode = request.getTemplateCode();
        Map<String, String> contentParams = request.getContentParams();
        List<String> targetList = request.getTargetList();
        TargetType targetType = request.getTargetType();
        unionChannelSendService.send(request);
        return R.ok(new SendResult(null, null));
    }
}
