package pro.notifiy.server.send;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pro.notifiy.server.model.InnerSendRequest;

@Service
@Slf4j
@RequiredArgsConstructor
public class UnionMailSendService implements UnionSendService {
    @Override
    public void send(InnerSendRequest request) {

    }
}
