package com.example.output.stream;

import com.example.output.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class KafkaStreamOutput {

    @Bean
    public Consumer<KStream<String, Student>> studentOutput(){

        return stringStudentKStream -> stringStudentKStream
                .foreach((key, student) -> log.info(student.toString()));

    }

}
