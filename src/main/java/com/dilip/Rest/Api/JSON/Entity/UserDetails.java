package com.dilip.Rest.Api.JSON.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Details_Info12")
public class UserDetails
{
	@Id
    private int id;
    private String name;
    private String city;
    private String gender;
    private String location;
    private Long number1;
}
