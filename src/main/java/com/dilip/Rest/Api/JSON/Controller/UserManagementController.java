package com.dilip.Rest.Api.JSON.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dilip.Rest.Api.JSON.Entity.UserDetails;
import com.dilip.Rest.Api.JSON.Service.UserManagementService;

@RestController
public class UserManagementController {
	
	@Autowired
	UserManagementService service;
	
	@RequestMapping("/value")
	public String getData(@RequestBody UserDetails e) {
		
		String s1 = service.getAddData(e);
		return"thjrkgenglk  ajebnfbgnn kbfaiewbfjbghu"+s1;
	}
	
	//For PathVariable=======================================
	
	/*
	 * @GetMapping(path = "user/{city}/{gender}") public List<EntityClass>
	 * getUser(@PathVariable("city")String city,@PathVariable("gender") String
	 * gender) {
	 * 
	 * System.out.println("there are the good behavior");
	 * 
	 * return service.getUserByCityAndGender(city,gender); }
	 * 
	 * @PutMapping(path ="users/{city}") public List<EntityClass>
	 * abc(@PathVariable("city")String city) {
	 * System.out.println("the city ids this");
	 * 
	 * return service.getUserByCity(city); }
	 */
	 
// RequestParam : Get Users Infromation based in city and gender ==================================

		// REST Service

		// Query Parameters / Query String

		// PATH Variables @GetMapping(path="/users/info/{city}/{gender}")

		//For RequestParam (localhost)Spring Web internally : /users/info?city=<value>&gender=<value>
	
	//In PostMan localhost:pathvariable/users/info?city=<value>&gender=<value>

	
	  @GetMapping(path = "users/info") 
	  public List<UserDetails>  getUsersInforByCityAndGender(@RequestParam String city, @RequestParam(name = "gender") String genderValue) {
	  
	  System.out.println("Fetching User Infromation by Gender :" + genderValue + " , city : " + city);
	  
	  return service.getUseresByCityAndGender(genderValue,city);
	  
	  }
	 
	 
		// Req : Get Users based on city always.
		// if gender is presented get Data city and gender
		// if gender is not presented get Data city
//For @RequestParam and @PathVariable used- localhost:9999/flipkart/users/info/{city}?city=<hyd>&gender=<Male>
		
		  @GetMapping(path = "/users/info/{city}") 
		  public List<UserDetails> getUsersInfoByCity(@RequestParam String gender, @PathVariable String city) {
		  
		  System.out.println("Fetching USer Infromation by Gender :" + gender +  " , city : " + city);
		  
		  if (gender != null) {
			  return service.getUsersByCityAndGender(city, gender);
			  }
		  else {
			  return service.getUsersByCity(city); 
			  }
		  
		  }
		 
}
