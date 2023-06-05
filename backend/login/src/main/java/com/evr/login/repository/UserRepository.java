package com.evr.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evr.login.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
