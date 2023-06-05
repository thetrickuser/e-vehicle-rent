package com.evr.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evr.login.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>{

}
