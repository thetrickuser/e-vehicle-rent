package com.evr.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evr.login.entity.Company;
import com.evr.login.entity.User;
import com.evr.login.repository.CompanyRepository;
import com.evr.login.repository.UserRepository;

@Service
public class LoginService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	public String registerUser(User user) {
		try {
			if (validateUserRegistrationRequest(user)) {
				userRepository.save(user);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return "User details saved";
	}

	
	public String registerCompany(Company company) {
		try {
			if (validateCompanyRegistrationRequest(company)) {
				companyRepository.save(company);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return "User details saved";
	}

	private boolean validateUserRegistrationRequest(User user) {
		if (!user.getName().isBlank() 
				&& !user.getEmail().isBlank() 
				&& !user.getPassword().isBlank()
				&& !user.getPhoneNumber().isBlank()) {
			return true;
		}
		
		return false;
	}
	
	private boolean validateCompanyRegistrationRequest(Company company) {
		if (!company.getName().isBlank() 
				&& !company.getEmail().isBlank() 
				&& !company.getPassword().isBlank()
				&& !company.getPhoneNumber().isBlank()
				&& !company.getGovtRegId().isBlank()) {
			return true;
		}
		
		return false;
	}
}
