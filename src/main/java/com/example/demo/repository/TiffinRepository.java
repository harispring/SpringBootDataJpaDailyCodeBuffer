package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Tiffin;

@Repository
public interface TiffinRepository extends JpaRepository<Tiffin, Integer>{
	
	//List<Tiffin> findByTiffinShopNameContaining(String tiffinShopName);
	
	
	//@Query("select t.tiffinShopName from Tiffin t")
	@Query(value ="select t1_0.shopname from tiffin t1_0",nativeQuery=true)
	List<String> getShopnames();

}
