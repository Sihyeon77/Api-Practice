package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student sihyeon = new Student("Sihyeon", "Sihyeon77@gmail.com", LocalDate.of(1997, 5, 7));
            Student yihyeon = new Student("Yihyeon", "joyiheyon@gmail.com", LocalDate.of(2000, 8, 13));
            Student hyona = new Student("Hyona", "Hyona@naver.com", LocalDate.of(2003, 3, 19));
            studentRepository.saveAll(List.of(sihyeon, yihyeon, hyona));
        };

    }
}
