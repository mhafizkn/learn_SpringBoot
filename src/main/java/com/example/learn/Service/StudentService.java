package com.example.learn.Service;

import com.example.learn.Model.student.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Hafiz", "hafizxus@gmail.com", LocalDate.of(1998, Month.AUGUST, 26), 24)
        );
    }
}
