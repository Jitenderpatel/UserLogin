package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.UserRegister;
import com.example.demo.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public UserRegister save(UserRegister user) {
		
		return userRepo.save(user);
		
		
	}
public UserRegister findRecord(UserRegister user) {	
	String email=user.getEmail();
	String pwd=user.getPassword();
	
return  userRepo.findByEmailAddress(email,pwd);
		
		
	}

}
