package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tiffin {
	
	@Id
	@SequenceGenerator(name = "tiffin_sequence", sequenceName = "tiffin_sequence", allocationSize = 1,initialValue = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tiffin_sequence")
	private Integer tiffinCenterId;
	
	@Column(name = "shopname")
	private String tiffinShopName;

}
