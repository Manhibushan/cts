package com.example.springjdbcdemo.springjdbcdemo.bean;

import java.sql.SQLException;
import java.util.List;




public interface Customerservice {
	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers() throws SQLException;
	public List<Customer> getCustomerById(String uId) throws SQLException;
	public Customer updateCustomerById(Customer customer)throws SQLException;
	
}
