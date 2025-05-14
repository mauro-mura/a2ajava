package io.github.vishalmysore.a2a.domain;

import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Data
@ToString
public class TaskQueryParams {
    private String id;
    private Integer historyLength;
    private Map<String, Object> metadata;
    private String sessionId;
    private Message message;
    private TaskPushNotificationConfig pushNotification;
    private List<String> acceptedOutputModes;
}
