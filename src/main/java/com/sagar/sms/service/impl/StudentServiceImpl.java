package com.sagar.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sagar.sms.entity.Student;
import com.sagar.sms.repository.StudentRepo;
import com.sagar.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long studentId) {
		return studentRepo.findById(studentId).get();
	}

	@Override
	public void deleteStudentById(Long studentId) {
		studentRepo.deleteById(studentId);;
	}

}
