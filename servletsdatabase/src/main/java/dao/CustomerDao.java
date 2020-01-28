package dao;

import java.util.List;

import model.Customer;

public interface CustomerDao {
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();

}
