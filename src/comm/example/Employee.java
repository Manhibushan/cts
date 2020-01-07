package comm.example

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	// default constructor

	public Employee() {

	}

	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;

	}

public static Employee createEmployee(int employeeId,String employeeName,double salary)
{
	return new Employee(employeeId,employeeName,salary);
}



public  String displayEmployeeDetails()
{
	return "employeeID:"+employeeId+"employeeName"+employeeName+"salary"+salary;
}


}
