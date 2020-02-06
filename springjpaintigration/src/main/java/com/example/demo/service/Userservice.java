package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.shared.Shared;

public interface Userservice {
	public Shared createUser(User user);
	public Shared findUserById(Integer id);
	

}
