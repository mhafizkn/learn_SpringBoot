package com.example.learn.Config;

import com.example.learn.Model.student.Student;
import com.example.learn.Repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student hafiz = new Student("Hafiz", "hafizxus@gmail.com", LocalDate.of(1998, Month.AUGUST, 26), 24);

            Student hatim = new Student("Hatim", "hatimxus@gmail.com", LocalDate.of(2008, Month.APRIL, 1), 14);

            repository.saveAll(
                    List.of(hafiz, hatim)
            );
        };
    }
}
