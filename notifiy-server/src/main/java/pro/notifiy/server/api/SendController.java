package pro.notifiy.server.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.notifiy.server.core.HttpResult;

@Slf4j
@RequiredArgsConstructor
@RestController
public class SendController {

    @PostMapping("/send")
    public HttpResult send() {
        return HttpResult.ok();
    }
}
