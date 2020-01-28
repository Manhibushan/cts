package servic;

import java.util.List;

import model.Customer;

public interface Customerservice {
	public Customer createCustomer(Customer customer);
	public List<Customer> getAllCustomer();
}
