package com.dilip.Rest.Api.JSON.Service;

import java.util.List;

import com.dilip.Rest.Api.JSON.Entity.UserDetails;

public interface UserManagementService {

	
	String getAddData(UserDetails e);
	
//PathVariable================================================================
	
	/*
	 * List<EntityClass> getUserByCityAndGender(String city, String gender);
	 * 
	 * List<EntityClass> getUserByCity(String city);
	 */
	

	//RequestParam===============================================================
	
	List<UserDetails> getUseresByCityAndGender(String city,String gendervalue);

	List<UserDetails> getUsersByCityAndGender(String city, String gender);

	List<UserDetails> getUsersByCity(String city);

	

}
