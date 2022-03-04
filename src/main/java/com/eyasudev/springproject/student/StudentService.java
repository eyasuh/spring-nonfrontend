package com.eyasudev.springproject.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

	public List<Student> getStudents() {
		return List.of(
				new Student(
						1L,
						"Chala",
						"chala@gmail.com",
						LocalDate.of(1994, Month.APRIL, 20),
						28
				)
		);
	}
}
