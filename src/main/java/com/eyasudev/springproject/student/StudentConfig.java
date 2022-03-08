package com.eyasudev.springproject.student;

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
			Student chala = new Student(
					"Chala",
					"chala@gmail.com",
					LocalDate.of(1994, Month.APRIL, 20)
			);

			Student abebe = new Student(
					"Abebe",
					"abebe@gmail.com",
					LocalDate.of(2000, Month.APRIL, 20)
			);
			repository.saveAll(
					List.of(chala, abebe)
			);
		};
	}
}
