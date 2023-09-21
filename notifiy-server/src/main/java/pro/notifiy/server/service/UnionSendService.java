package pro.notifiy.server.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pro.notifiy.server.api.SendRequest;
import pro.notifiy.server.api.SendResult;

@Slf4j
@RequiredArgsConstructor
@Service
public class UnionSendService {

    public SendResult send(SendRequest request) {
        return new SendResult(null, null);
    }
}
