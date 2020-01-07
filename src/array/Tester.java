package array;

import java.time.LocalDate;
import java.util.UUID;

public class Tester {
	public static void main(String[] args)
	{
	Employee employee=null;
	employee=new PermanentEmployee(UUID.randomUUID().toString(),"Marry",LocalDate.now(),12000);
	System.out.println(employee.getDetails());;
	
	employee=new TempEmployee(30);
	System.out.println(employee.getDetails());
	}

}
