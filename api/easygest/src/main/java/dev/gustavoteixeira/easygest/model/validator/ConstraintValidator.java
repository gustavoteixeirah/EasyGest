package dev.gustavoteixeira.easygest.model.validator;

import lombok.NoArgsConstructor;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class ConstraintValidator {

    private static final Validator VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();

    public static <T> void validate(T objectToValidate) {
        var errors = VALIDATOR.validate(objectToValidate);
        throwExceptions(errors);
    }

    private static <T> void throwExceptions(Set<ConstraintViolation<T>> errors) {
        if (!errors.isEmpty()) {
            var exception = new ConstraintViolationException(errors);
            throw new ConstraintException(BusinessErrors.ERROR_VALIDATING_CONSTRAINT, exception.getMessage());
        }
    }

}
