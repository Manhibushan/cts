package com.mycompany.springdemo6.springdemo6;

import java.sql.SQLException;
import java.util.List;




public interface Customerservice {
	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers() throws SQLException;
	public List<Customer> findById(String uId) throws SQLException;
	public Customer updateCustomer(Customer customer,String uId) throws SQLException;
	public void deleteCustomer(String uId) throws SQLException;

}
