package pro.notifiy.server.send;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;
import pro.notifiy.server.api.vo.SendRequest;
import pro.notifiy.server.jooq.tables.records.SendRequestRecord;
import pro.notifiy.server.model.InnerSendRequest;
import pro.notifiy.server.model.SendStatus;
import pro.notifiy.server.model.TargetType;
import pro.notifiy.server.utils.JsonUtils;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import static pro.notifiy.server.jooq.Tables.SEND_REQUEST;

@Service
@Slf4j
@RequiredArgsConstructor
public class CompositedUnionSendService implements UnionSendService {

    private final DSLContext dslContext;

    public void send(SendRequest request) {
        String templateCode = request.getTemplateCode();
        TargetType targetType = request.getTargetType();
        List<String> targetList = request.getTargetList();
        Map<String, String> contentParams = request.getContentParams();

        InnerSendRequest innerSendRequest = InnerSendRequest.from(request);
        send(innerSendRequest);
    }

    @Override
    public void send(InnerSendRequest request) {
        SendRequestRecord sendRequestRecord = dslContext.newRecord(SEND_REQUEST);
        sendRequestRecord.setAppId("");
        sendRequestRecord.setBatchId("");
        sendRequestRecord.setTemplateCode(request.getTemplateCode());
        sendRequestRecord.setTargetType(request.getTargetType().name());
        sendRequestRecord.setTargetList(JsonUtils.toJsonQuietly(request.getTargetList()));
        sendRequestRecord.setTemplateParams(JsonUtils.toJsonQuietly(request.getContentParams()));
        sendRequestRecord.setSendStatus(SendStatus.INIT);
        sendRequestRecord.setSendTime(null);
        sendRequestRecord.setSendResult("");
        sendRequestRecord.setCreateTime(LocalDateTime.now());
        sendRequestRecord.setUpdateTime(LocalDateTime.now());
        int insert = sendRequestRecord.insert();
        log.info("insert send request record: {}", insert);
        if (insert == 0) {
            throw new RuntimeException("insert send request record failed");
        }
    }
}
