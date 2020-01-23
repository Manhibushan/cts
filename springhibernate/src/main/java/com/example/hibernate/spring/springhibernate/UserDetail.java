package com.example.hibernate.spring.springhibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Entity
@Data
public class UserDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String userId;
	//@Length(min = 8,max = 15,message = "invalid username")
	private String userName;
	//@Email(message = "invalid email")
	private String email;
	public UserDetail(String userId,  String userName,
			 String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
	}
	

}
