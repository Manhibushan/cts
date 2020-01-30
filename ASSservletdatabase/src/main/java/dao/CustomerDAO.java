package dao;

import java.util.List;

import model.Customer;

public interface CustomerDAO {
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public Customer findbyId(int id);
	public void update(Customer customer);
	public void deletecustomer(Customer customer);
}
