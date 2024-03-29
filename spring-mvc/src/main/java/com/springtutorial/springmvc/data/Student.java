package com.springtutorial.springmvc.data;

import com.springtutorial.springmvc.validation.CourseCode;
import lombok.Data;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
public class Student {

    private String firstName;

    @NotEmpty(message = "required")
    private String lastName;

    @Min(value = 1, message = "Must be between 1 and 10 inclusive")
    @Max(value = 10, message = "Must be between 1 and 10 inclusive")
    private Integer grade;

    @Pattern(regexp = "^$|^\\d{6}", message = "Must contain 6 digits")
    private String postalCode;

    @CourseCode(value = {"CS", "LUV"}, message = "must start with CS or LUV")
    private String courseCode;

    private String country;
    private String programmingLanguage;
    private List<String> phones;

    private Map<String, String> countryOptions;
    private List<String> programmingLanguages;
    private List<String> phoneBrands;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("RO", "Romania");
        countryOptions.put("US", "United States");
        countryOptions.put("DE", "Germany");
        countryOptions.put("FR", "France");
        countryOptions.put("NE", "Netherlands");

        programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Python");
        programmingLanguages.add("C#");

        phoneBrands = new ArrayList<>();
        phoneBrands.add("Nokia");
        phoneBrands.add("Samsung");
        phoneBrands.add("Apple");
    }
}
