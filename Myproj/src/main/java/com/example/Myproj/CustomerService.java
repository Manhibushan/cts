package com.example.Myproj;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> findById(String uId) throws SQLException;
	public List<Customer> getAllCustomers() throws SQLException;
	public Customer updateCustomer(Customer customer,String uId) throws SQLException;
	public void deleteCustomer(String uId) throws SQLException;

}
