package com.evr.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evr.login.entity.Company;
import com.evr.login.entity.User;
import com.evr.login.service.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
		return loginService.registerUser(user);
	}
	
	@PostMapping("/register/company")
	public String registerCompany(@RequestBody Company company) {
		return loginService.registerCompany(company);
	}
	
}
