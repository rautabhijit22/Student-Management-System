package com.project.StudentmanagementSystem;

import com.project.StudentmanagementSystem.entity.Student;
import com.project.StudentmanagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import static com.project.StudentmanagementSystem.repository.StudentRepository.*;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"controller"})
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired

	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Abhi", "Raut", "abr@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Sam", "abc", "sam@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Victor", "xyz", "vic@gmail.com");
//		studentRepository.save(student3);


	}
}
