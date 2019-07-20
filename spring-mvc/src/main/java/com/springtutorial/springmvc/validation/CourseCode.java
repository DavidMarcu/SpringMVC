package com.springtutorial.springmvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = CourseCodeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    public String[] value() default "ABC";
    public String message() default "must start with ABC";

    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
