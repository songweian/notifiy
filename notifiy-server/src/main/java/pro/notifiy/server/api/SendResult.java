package pro.notifiy.server.api;

import java.util.Map;

public record SendResult(String batchId, Map<String, String> targetResult) {
}
