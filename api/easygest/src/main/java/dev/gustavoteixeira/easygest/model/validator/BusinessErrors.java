package dev.gustavoteixeira.easygest.model.validator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BusinessErrors {

    ERROR_VALIDATING_CONSTRAINT("Couldn't validate constraints: ");

    private final String value;

}
