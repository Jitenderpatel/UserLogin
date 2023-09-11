package com.example.demo.bean;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity(name = "userRegister")
@Data
@AllArgsConstructor
@ToString
public class UserRegister {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String phonenumber;
	private String password;
public UserRegister() {
	
}
	
}
