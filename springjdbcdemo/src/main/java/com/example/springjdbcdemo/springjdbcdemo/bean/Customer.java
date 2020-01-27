package com.example.springjdbcdemo.springjdbcdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Customer {
	private String fName;
	private String lname;
	private String email;
	private String uId;
	
	



	public Customer(String fName, String lname, String email) {
		super();
		this.fName = fName;
		this.lname = lname;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [fName=" + fName + ", lname=" + lname + ", email=" + email + ", uId=" + uId + "]";
	}

}