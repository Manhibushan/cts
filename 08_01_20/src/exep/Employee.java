package exep;

import java.util.UUID;

public class Employee {
	private String empName;
	private String empId;
	private String Address;
	private Employee employee=null;
	private double employeeExpierience;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public double getEmployeeExpierience() {
		return employeeExpierience;
	}
	public void setEmployeeExpierience(double employeeExpierience) {
		this.employeeExpierience = employeeExpierience;
	}
	public Employee(String empName, String empId, String address) throws EmployeeNotEligibleException
	{
		super();
		this.empName = empName;
		this.empId = empId;
		Address = address;
		this.employee = employee;
	}
	public Employee createemployee(String empName, String address,double employeeExpierience ) throws EmployeeNotEligibleException 
	{
		employee=new Employee(empName,UUID.randomUUID().toString(),address);
		if(employee.getEmployeeExpierience()<2.0)
		{
			throw new EmployeeNotEligibleException("Employee is not eligible");
		}
		return employee;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", Address=" + Address + ", employee=" + employee
				+ ", employeeExpierience=" + employeeExpierience + "]";
	}
	

}
