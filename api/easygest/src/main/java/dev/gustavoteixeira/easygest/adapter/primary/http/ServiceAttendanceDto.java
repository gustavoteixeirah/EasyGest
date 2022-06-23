package dev.gustavoteixeira.easygest.adapter.primary.http;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
public class ServiceAttendanceDto {

    String description;

    BigDecimal price;

    Integer minutes;

}
