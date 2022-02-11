package com.example.input.service;

import com.example.input.model.Student;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class StudentService {

    @Autowired
    private KafkaTemplate<String, Student> kafkaTemplate;

    private static final String TOPIC = "students-topic";

    public void createStudents(int numberOfStudents){

        Faker faker = new Faker();
        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            Student student = new Student(faker.name().firstName(), faker.name().lastName(), random.nextInt(50), random.nextInt(25));
            log.info("SUCCESFULLY SENT MESSAGE WITH BODY: " + student.toString() + " TO KAFKA TOPIC: " + TOPIC);
            kafkaTemplate.send(TOPIC, student);
        }

    }

}
