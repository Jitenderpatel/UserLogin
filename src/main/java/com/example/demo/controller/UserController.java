package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.UserRegister;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {
	@Autowired
	private UserService userService;
	
	
		
		
	
	
	@PostMapping("/users")
	public UserRegister userRegister(@RequestBody UserRegister user ) {
		System.out.println("hi");
		userService.save(user);
		return userService.save(user);
		
	}
	
	
	@GetMapping("usersss")
	public UserRegister findRecord(@RequestBody UserRegister user ) {
		
		UserRegister users=	userService.findRecord(user);
		
		return users;
		
	}
	

}
