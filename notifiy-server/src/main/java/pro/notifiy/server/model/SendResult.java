package pro.notifiy.server.model;

import java.util.Map;

public record SendResult(String batchId, Map<String, String> targetResult) {
}
