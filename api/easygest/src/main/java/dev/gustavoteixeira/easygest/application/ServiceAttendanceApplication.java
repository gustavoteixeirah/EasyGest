package dev.gustavoteixeira.easygest.application;

import dev.gustavoteixeira.easygest.model.serviceattendance.ServiceAttendance;
import dev.gustavoteixeira.easygest.model.serviceattendance.ServiceAttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class ServiceAttendanceApplication implements ServiceAttendanceService {

    private final TrackingService trackingService;

    @Override
    public Mono<String> create(ServiceAttendance serviceAttendance) {
        trackingService.notifyEvent("New service attendance created: " + serviceAttendance.toString());
        return Mono.empty();
    }

}
