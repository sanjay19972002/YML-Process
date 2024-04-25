package com.dilip.Rest.Api.JSON.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDetails {
	
	
	private int Id;
	private String name;
	private String city;
	private String gender;
	private String location;
	private Long number1;
	
	

}
