package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getStudents() {
		return List.of(new Student(1L,
				"Sihyeon",
				"jy6026@gmail.com",
				LocalDate.of(1997, Month.MAY, 7),
				26));
	}
}
