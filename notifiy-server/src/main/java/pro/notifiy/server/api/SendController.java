package pro.notifiy.server.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pro.notifiy.server.api.vo.SendRequest;
import pro.notifiy.server.core.HttpResult;
import pro.notifiy.server.send.CompositedUnionSendService;

/**
 * 消息发送
 */
@Slf4j
@RequiredArgsConstructor
@RestController
public class SendController {
    private final CompositedUnionSendService compositedUnionSendService;

    /**
     * 异步发送接口
     */
    @PostMapping("/api/union/async/send")
    public HttpResult send(@RequestBody SendRequest request) {
        compositedUnionSendService.send(request);
        return HttpResult.ok();
    }
}
