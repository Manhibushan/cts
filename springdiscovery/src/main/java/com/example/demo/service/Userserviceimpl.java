package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
@Service
public class Userserviceimpl implements Userservice {
	@Autowired
	private UserDao Userdao;
	
	
	@Override
	@Transactional
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return Userdao.save(user);
	}

}
