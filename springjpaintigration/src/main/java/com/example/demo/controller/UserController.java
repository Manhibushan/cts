package com.example.demo.controller;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.Userservice;
import com.example.demo.shared.Shared;

@RestController
@RequestMapping("/api")
public class UserController {
private Userservice userservice;


@Autowired
public UserController(Userservice userservice) {
	super();
	this.userservice = userservice;
}

@PostMapping("/users")
public Shared create(@RequestBody User user)
{
	user.setUId(UUID.randomUUID().toString());
	user.setCreationDate(LocalDate.now());
	user.setIsAdmin(false);
	return userservice.createUser(user);
}
@GetMapping("/users/{id}")
public Shared find(@PathVariable Integer id)
{
	return userservice.findUserById(id);
}
}
