package com.akshay.studentbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentBackendApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello World!";
	}
}
