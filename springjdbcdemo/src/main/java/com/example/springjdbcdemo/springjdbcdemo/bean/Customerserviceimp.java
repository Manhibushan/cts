package com.example.springjdbcdemo.springjdbcdemo.bean;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Component;
@Component("service")

public class Customerserviceimp implements Customerservice {
	private CustomerDao dao2;
	@Autowired
	public Customerserviceimp(CustomerDao dao2) {
		super();
		this.dao2 = dao2;
	}
	

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return dao2.createCustomer(customer);
	}

	

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return dao2.getAllCustomers() ;
	}


	@Override
	public List<Customer> getCustomerById(String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao2.getCustomerById(uId);
	}


	@Override
	public Customer updateCustomerById(Customer customer) throws SQLException {
		
		return dao2.updateCustomerById(customer);
	}


	

}
