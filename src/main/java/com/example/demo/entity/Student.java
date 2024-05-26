package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//in unique constraints we can take columnnames as Column name or property name
@Table(name = "tbl_student",uniqueConstraints = @UniqueConstraint(name="emailaddress", columnNames = {"email_address","guardianMobileNumber"}))
public class Student {

	@Id
	@SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
	private Long studentId;
	private String firstName;
	private String lastName;
	@Column(name = "email_address",nullable = false)
	private String emailId;
	/*
	 * private String guardianName; 
	 * private String guardianEmail; 
	 * private String guardianMobileNumber;
	 */
	@Embedded
	private Guardian guardian;

}
