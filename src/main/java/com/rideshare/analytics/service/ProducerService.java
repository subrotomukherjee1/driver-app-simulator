package com.rideshare.analytics.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class ProducerService {

    private final KafkaTemplate<String, String> template;

    public ProducerService(final KafkaTemplate<String, String> template) {
        this.template = template;
    }

    public void sendMessage(final String topic, final String message) {
        template.send(topic, message);
        System.out.println("Sent: " + message + " to topic: " + topic);
    }
}
