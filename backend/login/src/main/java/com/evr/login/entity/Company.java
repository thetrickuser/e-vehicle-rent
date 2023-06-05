package com.evr.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Company {
	
	@Id
	private Long id;
	
	private String name;
	private String govtRegId;
	private String location;
	private String email;
	private String phoneNumber;
	private String password;
}
