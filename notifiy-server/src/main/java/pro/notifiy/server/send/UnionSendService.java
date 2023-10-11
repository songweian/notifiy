package pro.notifiy.server.send;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pro.notifiy.server.api.vo.SendRequest;
import pro.notifiy.server.model.InnerSendRequest;

public interface UnionSendService {

    void send(InnerSendRequest request);

}
