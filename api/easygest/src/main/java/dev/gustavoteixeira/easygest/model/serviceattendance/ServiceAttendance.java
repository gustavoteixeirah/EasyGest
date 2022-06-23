package dev.gustavoteixeira.easygest.model.serviceattendance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

import static dev.gustavoteixeira.easygest.model.validator.ConstraintValidator.validate;
import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
public class ServiceAttendance {

    String id;

    String description;

    BigDecimal price;

    Integer minutes;

    public static class ServiceAttendanceBuilder {
        public ServiceAttendance build() {
            var service = new ServiceAttendance(
                    this.id,
                    this.description,
                    this.price,
                    this.minutes
            );

            validate(service);

            return service;
        }
    }

}
