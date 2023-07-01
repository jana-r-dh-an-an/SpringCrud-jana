package com.janacode.cruddemo;

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
			

			//reading the data from database
			readingStudent(studentDAO);
			


		};
		
	}
	private void readingStudent(StudentDAO studentDAO) {
		//Create a student object
		System.out.println("Creating new student objects...");

		Student tempStudent4= new Student("kiran", "kumar", "kiran34@gmail.com");


			//save the student
			System.out.println("saving the student object");
			studentDAO.save(tempStudent4);

			//display id of the saved student
			int theID= tempStudent4.getId();
			System.out.println("saved student. generated id: "+ theID);

			//retrieve student based on the id: primary key
			System.out.println("reterieving studnet with id: "+ theID);
			Student myStudent=studentDAO.findById(theID);

			//display student
			System.out.println("Found the student : "+myStudent);
	}
}


		



