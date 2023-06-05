package com.evr.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	private Long id;
	
	private String phoneNumber;
	private String email;
	private String password;
	private String name;
}
