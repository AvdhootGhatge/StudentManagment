package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Student;


@Repository
public interface StudentRepo extends CrudRepository<Student, Long>{
	
}
