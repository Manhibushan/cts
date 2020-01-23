package com.example.hibernate.spring.springhibernate;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository("dao")

public class UserDaoimp implements UserDao {

	private SessionFactory sessionFactory;
	private Session session;

	public UserDaoimp(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;

		session = sessionFactory.openSession();
	}

	@Override
@Transactional

	public UserDetail createUser(UserDetail user) {
		session.save(user);

		return user;
	}

}
