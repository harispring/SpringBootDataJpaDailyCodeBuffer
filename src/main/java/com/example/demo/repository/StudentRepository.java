package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	List<Student> findByFirstName(String name);
	List<Student> findByFirstNameAndGuardianName(String fname,String name);
	List<Student> findByFirstNameContaining(String name);
	List<Student> findByFirstNameNotNull();
	List<Student> findDistinctStudentByLastName(String lastname);

}
