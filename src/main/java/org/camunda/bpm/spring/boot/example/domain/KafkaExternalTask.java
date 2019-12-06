package org.camunda.bpm.spring.boot.example.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class KafkaExternalTask {

    private String processInstanceId;
    private String activityInstanceId;
    private String currentActivityId;
    private String camundaTopic;

}
