package com.teamrocket.legacytranslator.config.properties;

import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("com.teamrocket.kafka")
@Setter
@Getter
public class KafkaConnectProperties {

    private Map<String, Map<String, String>> connectors;
    private String kafkaConnectHost;
    private Integer kafkaConnectPort;

}
