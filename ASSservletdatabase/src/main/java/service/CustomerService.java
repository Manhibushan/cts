package service;

import java.util.List;

import model.Customer;

public interface CustomerService {
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer findBuyId(int id);
	public void update(Customer customer);
	public void deletecustomer(Customer customer);
}
