package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student cristian = new Student(
                    "Cristian Mundo",
                    "cris.mundo@outlook.com",
                    LocalDate.of(1999, Month.MARCH,3)
            );
            Student david = new Student(
                    "David Vallecios",
                    "dvallecios@outlook.com",
                    LocalDate.of(1999, Month.AUGUST,2)
            );
            repository.saveAll(Arrays.asList(cristian,david));
        };
    }
}
