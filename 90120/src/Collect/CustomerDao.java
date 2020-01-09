package Collect;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor

public class CustomerDao {
private Set<Customer> customerSet=null;
	
	{
		customerSet=new HashSet<Customer>();
	}
	

	
	public Set<Customer> getAllCustomers()
	{
		return customerSet;
	}

	public void createCustomer(int customerId, String firstName, String lastName, String email) {
		customerSet.add(new Customer(customerId, firstName, lastName, email));
		// TODO Auto-generated method stub
		
	}
}
