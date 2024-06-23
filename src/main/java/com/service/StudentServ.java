package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Student;
import com.repository.StudentRepo;

@Service
public class StudentServ {
	
	@Autowired
	StudentRepo sr;

	public Student getStudent(long rn) {
		Optional<Student>std =sr.findById(rn);
		return std.isPresent() ? std.get() : new Student();
	}

	public Student addStudent(Student std) {
		
		return sr.save(std);
	}
	
	

}
