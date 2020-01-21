package com.mycompany.springdemo6.springdemo6;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;



public class Customerserviceimp implements Customerservice {
	static Logger logger=Logger.getLogger("com.mycompany.springdemo6.springdemo6.bean.Customerserviceimp");
	private CustomerDao dao;
	{
		dao=new CustomerDaoimp();
		logger.info("got dao");
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return dao.getAllCustomers();
	}

	@Override
	public List<Customer> findById(String uId) throws SQLException {
		return dao.findbyId(uId);
	}

	@Override
	public Customer updateCustomer(Customer customer, String uId) throws SQLException {
		// TODO Auto-generated method stub
		return dao.updateCustomer(customer,uId);
	}

	@Override
	public void deleteCustomer(String uId) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	

}
