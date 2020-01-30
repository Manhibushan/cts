package service;

import java.util.List;

import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import model.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO dao;
	{
		dao=new CustomerDAOImpl();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return dao.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return dao.getAllCustomer();
	}

	@Override
	public Customer findBuyId(int id) {
		// TODO Auto-generated method stub
		return dao.findbyId(id);
	}

	@Override
	public void update(Customer customer) {
		dao.update(customer);
		
	}

	@Override
	public void deletecustomer(Customer customer) {
		dao.deletecustomer(customer);
		
	}

	







	
}
