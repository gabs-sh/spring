package io.github.com.gabrielsilvan.constraint;

import io.github.com.gabrielsilvan.annotations.NameValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidatorConstraint implements ConstraintValidator<NameValidator, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.length() > 4;
    }
}
