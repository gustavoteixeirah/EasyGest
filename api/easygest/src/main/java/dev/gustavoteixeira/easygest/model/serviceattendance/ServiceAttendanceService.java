package dev.gustavoteixeira.easygest.model.serviceattendance;

import reactor.core.publisher.Mono;

public interface ServiceAttendanceService {

    Mono<String> create(ServiceAttendance serviceAttendance);

}
