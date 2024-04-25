package com.dilip.Rest.Api.JSON.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dilip.Rest.Api.JSON.Entity.UserDetails;

@Repository
public interface EntityClassRepository extends JpaRepository<UserDetails, Integer> {

	//PathVariable============================================================
	
	/*
	 * List<EntityClass> findByCityAndGender(String city, String gender);
	 * 
	 * List<EntityClass> findByCity(String city);
	 */

	// @RequestParam And @PathVariable =======================================================
	
	List<UserDetails> findByCityAndGender(String city,String gendervalue);
	//List<UserDetails> findByCityAndGender(String city, String gender);

	List<UserDetails> findByCity(String city);

}
