package com.teamrocket.legacytranslator.config;

import static org.springframework.http.HttpHeaders.CONTENT_TYPE;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate jsonRestTemplate() {
        return new RestTemplateBuilder()
            .defaultHeader(CONTENT_TYPE, "application/json")
            .build();
    }

}
