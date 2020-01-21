package com.example.springjdbcdemo._01_20;

import java.sql.SQLException;
import java.util.List;

public interface Customerservice {
	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers()throws SQLException;
	public List<Customer> getCustomerById(String uId) throws SQLException;
	public Customer updateCustomerbyId(Customer customer)throws SQLException;
	public Customer deleteCustomerbyId(Customer customer)throws SQLException;


}
