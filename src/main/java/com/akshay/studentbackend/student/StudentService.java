package com.akshay.studentbackend.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Akshay Khanna",
                        "akshay@gmail.com",
                        LocalDate.of(2000, 10, 8),
                        21
                ),
                new Student(
                        2L,
                        "Vineet Khanna",
                        "vineet@gmail.com",
                        LocalDate.of(1995, 2, 18),
                        27
                )
        );
    }

}
