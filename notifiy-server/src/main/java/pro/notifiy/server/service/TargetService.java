package pro.notifiy.server.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pro.notifiy.server.model.TargetType;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Service
public class TargetService {

    public Map<String, String> resolveTarget(List<String> target, TargetType targetType) {
        return Collections.emptyMap();
    }

}
