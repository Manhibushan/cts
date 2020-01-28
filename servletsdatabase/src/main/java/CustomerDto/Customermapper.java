package CustomerDto;

import model.Customer;
import model.CustomerDto;

public class Customermapper implements CustomerDtoimp{

	@Override
	public Customer customerDtoToCustomer(CustomerDto dto) {
	if(dto==null)
	{
		return null;
		
	}
	else
	{
		Customer customer=new Customer();
		customer.setUId(dto.getUId());
		customer.setFirstname(dto.getFirstname());
		customer.setLastname(dto.getLastname());
		customer.setEmail(dto.getEmail());
		return customer;
	}
		
	}

	@Override
	public CustomerDto customerToCustomerDto(Customer customer) {
		if(customer==null)
		{
			return null;
			
		}
		else
		{
		CustomerDto cdto=new CustomerDto();
		cdto.setUId(customer.getUId());
		cdto.setFirstname(customer.getFirstname());
		cdto.setLastname(customer.getLastname());
		cdto.setEmail(customer.getEmail());
		return cdto;
		
	}

}
}
