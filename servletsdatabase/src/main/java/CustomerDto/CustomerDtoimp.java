package CustomerDto;

import org.mapstruct.Mapper;

import model.Customer;
import model.CustomerDto;

@Mapper
public interface CustomerDtoimp {
	public Customer customerDtoToCustomer(CustomerDto dto);
	public CustomerDto customerToCustomerDto(Customer customer);

}
