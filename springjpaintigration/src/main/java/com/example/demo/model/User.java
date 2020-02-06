package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JsonIgnore
	private String uId;
	private String firstName;
	private String lastName;
	private String password;
	private String securitysocialNumber;
	@JsonIgnore
	private Boolean isAdmin;
	@JsonIgnore
	private LocalDate creationDate;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String uId, String firstName, String lastName, String password, String securitysocialNumber,
			Boolean isAdmin, LocalDate creationDate) {
		super();
		this.id = id;
		this.uId = uId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.securitysocialNumber = securitysocialNumber;
		this.isAdmin = isAdmin;
		this.creationDate = creationDate;
	}

	
	
	
	
	
}
