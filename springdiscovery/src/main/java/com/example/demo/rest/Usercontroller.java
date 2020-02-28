package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.Userservice;

@RestController
@RequestMapping("/api")
public class Usercontroller {
	
	private Userservice userservice;
	@Autowired
	public Usercontroller(Userservice userservice) 
	{
		super();
		this.userservice = userservice;
	}
	@PostMapping("/users")
	public User createUser(@RequestBody User user)
	{
		return userservice.createUser(user);
		
	}

	
	
	
	

}
