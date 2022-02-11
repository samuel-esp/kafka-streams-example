package com.example.processor.stream;

import com.example.processor.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Printed;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
@Slf4j
public class KafkaStreamProcessor {

    @Bean
    public Function<KStream<String, Student>, KStream<String, Student>> studentProcessor(){

        log.info("PROCESSING STUDENT");

        return stringStudentKStream -> stringStudentKStream
                .filter((key, student) -> student.getAge() > 30);

    }


}
