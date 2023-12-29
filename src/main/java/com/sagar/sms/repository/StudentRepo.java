package com.sagar.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagar.sms.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
