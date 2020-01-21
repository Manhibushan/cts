package com.mycompany.springdemo6.springdemo6;


import java.sql.SQLException;
import java.util.List;



public interface CustomerDao {
	public Customer createCustomer(Customer customer)throws SQLException;
	public List<Customer> findbyId(String uId)throws SQLException;
	public List<Customer> getAllCustomers()throws SQLException;
	public Customer updateCustomer(Customer customer,String uId)throws SQLException;
	
	}


