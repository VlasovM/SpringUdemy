package com.javlasov.spring.mvc;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

@Data
@ToString
public class Employee {

    @Size(min = 2, message = "name must be minimum 2 symbols")
    private String name;
    @NotBlank(message = "Surname cannot be empty")
    private String surname;
    @Min(value = 500, message = "must be greater than 499")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageMap;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "phone could be: NNN-NN-NN")
    private String phoneNumber;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");

        carBrands = new HashMap<>();
        carBrands.put("Mercedes-Benz", "MB");
        carBrands.put("Audi", "AUDI");

        languageMap = new HashMap<>();
        languageMap.put("English", "EN");
        languageMap.put("French", "FR");
    }
}
