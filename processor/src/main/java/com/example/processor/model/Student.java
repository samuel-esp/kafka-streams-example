package com.example.processor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Student {

    private String name;

    private String surname;

    private Integer age;

    private Integer examsPassed;

}
