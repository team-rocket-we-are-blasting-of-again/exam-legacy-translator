package com.teamrocket.legacytranslator.config.kafka;

import com.teamrocket.legacytranslator.config.properties.KafkaConnectProperties;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@RequiredArgsConstructor
public class KafkaConnectConfig {

    private final KafkaConnectProperties kafkaConnectProperties;
    private final RestTemplate restTemplate;

    @PostConstruct
    private void init() {
        Map<String, Map<String, String>> connectors = kafkaConnectProperties.getConnectors();

        for (Entry<String, Map<String, String>> entry : connectors.entrySet()) {
            String connectorName = entry.getKey();
            Map<String, String> connectorConfig = entry.getValue();

            String requestUrl = "http://%s:%d/connectors/%s/config".formatted(
                kafkaConnectProperties.getKafkaConnectHost(),
                kafkaConnectProperties.getKafkaConnectPort(),
                connectorName
            );

            // Making a put request to the kafka connect api.
            // This will either create the connector or update it if it's already there
            restTemplate.put(requestUrl, connectorConfig);
        }
    }

}
