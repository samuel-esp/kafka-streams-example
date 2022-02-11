package com.example.input.controller;

import com.example.input.model.Student;
import com.example.input.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student/{numberOfStudents}")
    public void createStudents(@PathVariable int numberOfStudents){
        log.info("CREATING " + numberOfStudents + " STUDENTS" );
        studentService.createStudents(numberOfStudents);
    }


}
