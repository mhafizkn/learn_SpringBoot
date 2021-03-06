package com.example.learn.Controller;

import com.example.learn.Model.student.Student;
import com.example.learn.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

	private final StudentService studentService;

	// Constructor
	@Autowired
	public StudentController(StudentService studentService){
		this.studentService = studentService;
	}

    @GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();

	}
}
