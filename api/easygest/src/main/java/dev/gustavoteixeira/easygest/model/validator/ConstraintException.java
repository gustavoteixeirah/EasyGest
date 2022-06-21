package dev.gustavoteixeira.easygest.model.validator;

public class ConstraintException extends RuntimeException {

    public ConstraintException(BusinessErrors error, String parameters) {
        super(error.getValue() + parameters);
    }

}
