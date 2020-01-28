package servic;

import java.util.List;

import dao.CustomerDao;
import dao.CustomerDaoimp;
import model.Customer;

public class CustomerServiceimp implements Customerservice {

	private CustomerDao dao;
	{
		dao=new CustomerDaoimp();
	}
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.createCustomer(customer);
	}
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

}
