package com.sagar.sms.service;

import java.util.List;

import com.sagar.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudent();
	
	Student addStudent(Student student);
	
	Student updateStudent(Student student);
	
	Student getStudentById(Long studentId);
	
	void deleteStudentById(Long studentId);
}
