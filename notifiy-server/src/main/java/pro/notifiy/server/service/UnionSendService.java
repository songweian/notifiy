package pro.notifiy.server.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pro.notifiy.server.api.SendRequest;
import pro.notifiy.server.api.SendResult;
import pro.notifiy.server.core.R;

@Slf4j
@RequiredArgsConstructor
@Service
public class UnionSendService {

    public R<SendResult> send(SendRequest request) {
        return R.ok(new SendResult(null, null));
    }
}
