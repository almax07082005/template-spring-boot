package pr.templatespringboot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pr.templatespringboot.service.ProducerService;

@RequiredArgsConstructor
@RestController
public class IndexController {

    private final ProducerService producerService;

    @GetMapping("/index")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Hello, World!");
    }

    @GetMapping("/kafka-producer")
    public ResponseEntity<String> kafkaProducer() {
        producerService.sendMessage("Hello from Kafka Producer!");
        return ResponseEntity
                .accepted()
                .body("Message sent to Kafka topic successfully.");
    }
}
