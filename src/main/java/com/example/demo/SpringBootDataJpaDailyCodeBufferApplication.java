package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;

import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.TiffinRepository;

@SpringBootApplication
public class SpringBootDataJpaDailyCodeBufferApplication implements CommandLineRunner {
	
	@Autowired
	StudentRepository repository;
	
	@Autowired
	TiffinRepository tiffinRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaDailyCodeBufferApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	Student  student = Student.builder().firstName("haribabu").lastName("nasika").emailId("hari@gmail.com")
				.guardianName("Mohan").guardianEmail("mohan@gmail.com").guardianMobileNumber("56554554").build(); */
	//	Guardian guardian = Guardian.builder().name("Mohan").email("mohan@gmail.com").mobile("487874786").build();
	//	Student  student = Student.builder().firstName("haribabu").lastName("nasika").emailId("hari@gmail.com").guardian(guardian).build();
		
		
		
		//repository.save(student);
		
		//repository.findAll().forEach(System.out::println);
		//repository.findByFirstName("haribabu").forEach(System.out::println);
		//repository.findByFirstNameAndGuardianName("haribabu","Mohan").forEach(System.out::println);
		//repository.findByFirstNameContaining("ha").forEach(System.out::println);
		//repository.findByFirstNameNotNull().forEach(System.out::println);
		//repository.findDistinctStudentByLastName("nasika").forEach(System.out::println);
		
		//Tiffin t1 = Tiffin.builder().tiffinShopName("main center").build();
		//Tiffin t2 = Tiffin.builder().tiffinShopName("new main center").build();
		//tiffinRepository.save(t1);
		//tiffinRepository.save(t2);
		//tiffinRepository.findAll().forEach(System.out::println);
		
		/*
		 * Sort s= Sort.by("tiffinShopName").descending();
		 * tiffinRepository.findAll(s).forEach(System.out::println);
		 */
		
		tiffinRepository.getShopnames().forEach(System.out::println);
		
		
		
		
		
		
		
		
	}

}
