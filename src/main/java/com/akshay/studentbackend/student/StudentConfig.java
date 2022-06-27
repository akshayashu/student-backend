package com.akshay.studentbackend.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student akshay = new Student(
                    "Akshay Khanna",
                    "akshay@gmail.com",
                    LocalDate.of(2000, 10, 8)
            );

            Student vineet = new Student(
                    "Vineet Khanna",
                    "vineet@gmail.com",
                    LocalDate.of(1995, 2, 18)
            );

            repository.saveAll(
                    List.of(akshay, vineet)
            );
        };
    }
}
