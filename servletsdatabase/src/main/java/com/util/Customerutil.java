package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Customer;

public class Customerutil {
	private static SessionFactory factory=null;
	public static SessionFactory getMysessionfactory()
	{
		 return new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Customer.class)
				.buildSessionFactory();
		
	}

}
