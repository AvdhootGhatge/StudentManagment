package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student;
import com.service.StudentServ;

@RestController
public class StudentControl {
	
	@Autowired
	StudentServ ss;
	
	@GetMapping("/student")
	public Student getStudent(@RequestParam("rollno") long rn) {
		return ss.getStudent(rn);
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student std) {
		return ss.addStudent(std);
	}
}
