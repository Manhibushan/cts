package com.mycompany.springdemo5.bean;


import java.sql.SQLException;
import java.util.List;



public interface CustomerDao {
	public Customer createCustomer(Customer customer)throws SQLException;
	//public List<Customer> findbyId(String uId);
	//public List<Customer> getAllCustomers();
	//public Customer updateCustomer(Customer customer,String uId);
	//public void deleteCustomer(String uId);
	}


