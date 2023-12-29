package com.sagar.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sagar.sms.entity.Student;
import com.sagar.sms.repository.StudentRepo;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
		System.out.println("success");
	}
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {
//		Student s1=new Student();
//		s1.setFirstName("elangovan");
//		s1.setLastName("palanisamy");
//		s1.setEmail("elango@gmail.com");
//		
//		studentRepo.save(s1);
//		
//		Student s2=new Student();
//		s2.setFirstName("venkatesh");
//		s2.setLastName("kulandhai goundar");
//		s2.setEmail("venky@gmail.com");
//		
//		studentRepo.save(s2);
	}

}
