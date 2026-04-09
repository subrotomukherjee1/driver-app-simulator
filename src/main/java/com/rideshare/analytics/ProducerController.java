package com.rideshare.analytics;

import com.rideshare.analytics.service.ProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {
    private final ProducerService producerService;

    public ProducerController(final ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/send")
    public void sendMessage(@RequestParam String message) {
        producerService.sendMessage("demo-topic", message);
    }
}
