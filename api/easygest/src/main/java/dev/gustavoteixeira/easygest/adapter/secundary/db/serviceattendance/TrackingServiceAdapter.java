package dev.gustavoteixeira.easygest.adapter.secundary.db.serviceattendance;

import dev.gustavoteixeira.easygest.application.TrackingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
class TrackingServiceAdapter implements TrackingService {

    private static final String TOPIC = "tracking";

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void notifyEvent(String message) {
        log.info("Payload sent: {}", message);
        kafkaTemplate.send(TOPIC, message);
    }
}
