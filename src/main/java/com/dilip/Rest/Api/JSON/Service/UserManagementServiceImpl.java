package com.dilip.Rest.Api.JSON.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilip.Rest.Api.JSON.Address.AddressDetails;
import com.dilip.Rest.Api.JSON.Entity.UserDetails;
import com.dilip.Rest.Api.JSON.Repository.EntityClassRepository;

@Service
public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	EntityClassRepository udr1;

	public String jfhi() {

		System.out.println("there are suitable");
		return "smart";
	}

	public String Alldata(AddressDetails AD) {

		UserDetails e = new UserDetails();

		e.setId(AD.getId());
		e.setName(AD.getName());
		e.setCity(AD.getCity());
		e.setGender(AD.getGender());
		e.setLocation(AD.getLocation());
		e.setNumber1(AD.getNumber1());

		e = udr1.save(e);

		return "Can you explain this topic";

	}

	// Add value for table
	@Override
	public String getAddData(UserDetails e) {

		return "the data is save" + udr1.save(e);
	}

	/*
	 * // For PathVariable=====================================================================
	 * 
	 * @Override public List<EntityClass> getUserByCityAndGender(String city, String
	 * gender) {
	 * 
	 * List<EntityClass> ec = udr1.findByCityAndGender(city, gender);
	 * 
	 * return ec; }
	 * 
	 * @Override public List<EntityClass> getUserByCity(String city) {
	 * 
	 * 
	 * return udr1.findByCity(city);
	 * 
	 * }
	 */
	
	
	
	//RequestParam================================================================================
	  
	  @Override
	  
	  public List<UserDetails> getUseresByCityAndGender(String city,String genderValue){
		  
		  return udr1.findByCityAndGender(genderValue,city);
	  }
	
	  @Override
	  public List<UserDetails> getUsersByCityAndGender(String city, String gender){ 
		 
		  
		  return udr1.findByCityAndGender(city, gender);
		  }
	
	  @Override
	  public List<UserDetails> getUsersByCity(String city) {
		  
		  // TODO Auto-generated method stub 
	  return udr1.findByCity(city);
	  }
	 	
}
