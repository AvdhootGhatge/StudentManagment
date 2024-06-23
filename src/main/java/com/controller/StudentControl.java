package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public Student getStudent(@RequestParam("rollnNo") long rn) {
		return ss.getStudent(rn);
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student std) {
		return ss.addStudent(std);
	}
	
	@GetMapping("/allStudents")
	public List<Student> getAllStudents(){
		return ss.getAllStudents();
	}
	
	@PutMapping("/updateStd")
	public Student updateStudent(@RequestParam("rollNo") long rn,
								@RequestParam("name") String name,
								@RequestParam("address") String address) {
		return ss.updateStudent(rn, name, address);
	}
	
	@DeleteMapping("/deleteStd")
	public String deleteStudent(@RequestParam("rollNo") long rn) {
		return ss.deleteStudent(rn);
	}
}
