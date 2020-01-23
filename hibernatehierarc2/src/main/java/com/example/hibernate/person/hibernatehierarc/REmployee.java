package com.example.hibernate.person.hibernatehierarc;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
@Data
@Entity
@DiscriminatorValue("regularemployee")
public class REmployee extends Employee {
	private String salary;
	

	public REmployee() {
	}


	public REmployee(String name, LocalDate doj,String salary) {
		super(name,doj);
		this.salary = salary;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	
	

}
