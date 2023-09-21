package pro.notifiy.server.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pro.notifiy.server.core.HttpResult;
import pro.notifiy.server.core.R;
import pro.notifiy.server.service.UnionSendService;

@Slf4j
@RequiredArgsConstructor
@RestController
public class SendController {
    private final UnionSendService unionSendService;

    @PostMapping("/send")
    public HttpResult send(@RequestBody SendRequest request) {
        R<SendResult> sendResult = unionSendService.send(request);
        if (sendResult.isError()) {
            return HttpResult.error500();
        }
        return HttpResult.ok(sendResult.data());
    }
}
