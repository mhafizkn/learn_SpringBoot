package com.example.learn.Service;

import com.example.learn.Model.student.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Hafiz", "hafizxus@gmail.com", LocalDate.of(1998, Month.AUGUST, 26), 24)
        );
    }
}