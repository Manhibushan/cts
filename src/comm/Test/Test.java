package comm.Test;

import comm.example.Employee;

public class Test {
	public static void main(String[] args)
	{
		Employee employee=new Employee(100, "john", 12000);
		System.out.println(employee.displayEmployeeDetails());
	}
	}


