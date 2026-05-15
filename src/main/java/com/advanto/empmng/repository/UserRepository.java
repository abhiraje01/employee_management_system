package com.advanto.empmng.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advanto.empmng.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
		User findByUsername(String username);
}
