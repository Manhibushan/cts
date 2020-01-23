package com.example.hibernate.person.hibernatehierarc;

import java.time.LocalDate;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
@Data
@Entity
@DiscriminatorValue("contract employee")
public class CEmployee extends Employee {
	private String hourlypay;

	public CEmployee() {
	}

	public CEmployee(String name, LocalDate doj,String hourlypay) {
		super(name,doj);
		this.hourlypay = hourlypay;
	}

	public String getHourlypay() {
		return hourlypay;
	}

	public void setHourlypay(String hourlypay) {
		this.hourlypay = hourlypay;
	}

	
	

}
