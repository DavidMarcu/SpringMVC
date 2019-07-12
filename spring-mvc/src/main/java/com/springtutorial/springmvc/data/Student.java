package com.springtutorial.springmvc.data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Student {

    private String firstName;
    private String lastName;
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
