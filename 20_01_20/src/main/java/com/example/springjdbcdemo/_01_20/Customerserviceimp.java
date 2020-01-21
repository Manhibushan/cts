package com.example.springjdbcdemo._01_20;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("service")
public class Customerserviceimp implements Customerservice{
	private CustomerDao dao;
	
@Autowired
	public Customerserviceimp(CustomerDao dao) {
		super();
		this.dao = dao;
	}
	

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	@Override
	public List<Customer> getCustomerById(String uId) throws SQLException {
		// TODO Auto-generated method stub
		
		return dao.getCustomerbyId(uId);
	}


	@Override
	public Customer updateCustomerbyId(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return dao.updateCustomerbyId(customer);
	}


	@Override
	public Customer deleteCustomerbyId(Customer customer) throws SQLException {
		
		return dao.deleteCustomerbyId(customer);
	}


	
	
	

}
