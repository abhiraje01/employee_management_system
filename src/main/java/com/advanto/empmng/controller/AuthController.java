package com.advanto.empmng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advanto.empmng.entity.User;
import com.advanto.empmng.repository.UserRepository;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserRepository userRepository;
	
	
	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
		
		userRepository.save(user);
		
		return "User Resistered";
		
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestBody User user) {
		
		User presentUser = userRepository.findByUsername(user.getUsername());
		
		if(presentUser.getPassword().equals(user.getPassword())) {
			return "Login Success";
		}
		return "Invalid Password";
		
	}
}
