package com.example.hibernate.spring.springhibernate;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service("service")

public class Userserviceimp implements UserService {
	private UserDao dao;

	public Userserviceimp(UserDao dao) {
		super();
		this.dao = dao;
	}
	@Override
	@Transactional
	public UserDetail createUser(UserDetail user) {
		// TODO Auto-generated method stub
		return dao.createUser(user);
	}

}
