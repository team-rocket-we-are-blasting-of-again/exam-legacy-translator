package com.teamrocket.legacytranslator.application;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics = "legacy-orders", groupId = "legacy")
    void listen(Object orderDto) {
        System.out.println(orderDto);
    }

    @KafkaListener(topics = "legacy-users", groupId = "legacy")
    void listenSomething(Object orderDto) {
        System.out.println(orderDto);
    }

}
