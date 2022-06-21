package dev.gustavoteixeira.easygest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.time.Duration;

import static dev.gustavoteixeira.easygest.model.validator.ConstraintValidator.validate;
import static lombok.AccessLevel.PRIVATE;

@Value
@Builder
@AllArgsConstructor(access = PRIVATE)
public class Service {

    String id;

    String description;

    BigDecimal price;

    Duration duration;

    public static class ServiceBuilder {
        public Service build() {
            var service = new Service(
                    this.id,
                    this.description,
                    this.price,
                    this.duration
            );

            validate(service);

            return service;
        }
    }

}
