package com.janacode.cruddemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.janacode.cruddemo.dao.StudentDAO;
import com.janacode.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
			

			QueryForStudents(studentDAO);
			


		};
		
	}
	private void QueryForStudents(StudentDAO studentDAO) {

		List<Student> theStudent=studentDAO.findAll();

		for(Student theResult:theStudent){
			System.out.println(theResult);
		}
		
	}
}

