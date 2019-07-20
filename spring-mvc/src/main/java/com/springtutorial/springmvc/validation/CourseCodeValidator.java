package com.springtutorial.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CourseCode, String> {

    private String[] coursePrefixes;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefixes = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String courseCode, ConstraintValidatorContext constraintValidatorContext) {
        if(courseCode.equals("")){
            return true;
        }
        for(String coursePrefix : coursePrefixes){
            if(courseCode.startsWith(coursePrefix))
                return true;
        }
        return false;
    }
}
