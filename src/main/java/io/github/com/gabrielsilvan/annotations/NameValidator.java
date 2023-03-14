package io.github.com.gabrielsilvan.annotations;

import io.github.com.gabrielsilvan.constraint.NameValidatorConstraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NameValidatorConstraint.class)
public @interface NameValidator {
    String message() default "Validação falhou!";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
