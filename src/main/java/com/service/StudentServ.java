package com.service;

import java.util.List;
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
		return std.isPresent() ? std.get() : null;
	}

	public Student addStudent(Student std) {
		
		return sr.save(std);
	}

	public List<Student> getAllStudents() {
		return (List<Student>) sr.findAll();
	}

	public Student updateStudent(long rn, String name, String address) {
		Student std = getStudent(rn);
		if(std==null) {
			return std;
		}else {
			std.setName(name);
			std.setAddress(address);
			sr.save(std);
			return std;
		}
	}

	public String deleteStudent(long rn) {
		Student std = getStudent(rn);
		if(std==null) {
			return "Student with this roll no is not registered.....";
		}else {
			sr.deleteById(rn);
			return "Student info deleted successfully.....";
		}
		
	}

}
