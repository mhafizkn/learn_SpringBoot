package com.example.learn;

import com.example.learn.Model.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
//@RestController
public class LearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
	}

	// Return as JSON list
//	@GetMapping("/")
//	public List<String> hello() {
//		return List.of("Spring Boot - Main Page", "Hello World");
//	}
//
//	@GetMapping("/student")
//	public List<Student> students() {
//		return List.of(
//				new Student(1L, "Hafiz", "hafizxus@gmail.com", LocalDate.of(1998, Month.AUGUST, 26), 24)
//		);
//	}
}
