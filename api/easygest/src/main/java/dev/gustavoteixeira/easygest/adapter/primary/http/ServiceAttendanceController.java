package dev.gustavoteixeira.easygest.adapter.primary.http;

import dev.gustavoteixeira.easygest.model.serviceattendance.ServiceAttendanceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import static org.springframework.http.HttpStatus.CREATED;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/services-attendances")
class ServiceAttendanceController {

    private final ServiceAttendanceService service;
    private final ServiceAttendanceMapper mapper;

    @PostMapping
    @ResponseStatus(CREATED)
    public Mono<String> createNewServiceAttendance(@RequestBody ServiceAttendanceDto serviceAttendanceDto) {
        log.info("Request received to create a new service attendance: {}.", serviceAttendanceDto);
        return Mono.just(serviceAttendanceDto)
                .map(mapper::toServiceAttendance)
                .flatMap(service::create);
    }

}
