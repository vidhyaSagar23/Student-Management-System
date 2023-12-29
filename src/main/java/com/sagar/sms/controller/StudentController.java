package com.sagar.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sagar.sms.entity.Student;
import com.sagar.sms.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/get-all-students")
	public String getAllStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudent());
		return "students";
	}
	
	@GetMapping("/add-student-form")
	public String createStudentForm(Model model) {
		
//		creating student object to hold student form data
		Student student=new Student();
		model.addAttribute("student", student);
		return "add-student";
	}
	
	@PostMapping("/add-students")
	public String addStudent(@ModelAttribute("student") Student student) {
		studentService.addStudent(student);
		return "redirect:/get-all-students";
	}
	
	@GetMapping("/updateform/{studentId}")
	public String updateStudentForm(@PathVariable Long studentId,Model model) {
		model.addAttribute("student", studentService.getStudentById(studentId));
		return "update-student";
	}
	
	@PostMapping("/update-student/{studentId}")
	public String updateStudent(@PathVariable Long studentId,@ModelAttribute("student") Student student,Model model) {
		Student existingStudent=studentService.getStudentById(studentId);
		existingStudent.setStudentId(studentId);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		studentService.updateStudent(existingStudent);
		return "redirect:/get-all-students";
	}
	
	@GetMapping("/delete/{studentId}")
	public String deleteStudent(@PathVariable Long studentId) {
		studentService.deleteStudentById(studentId);
		return "redirect:/get-all-students";
	}
	
	
	
	
	
	
	
	
	
	
	

}
