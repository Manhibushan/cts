package Assignment;

import java.util.Date;

public class Employee implements Comparable{
	private String id;
	private String name;
	private String dept;
	private Date dateofjoining;
	private int age;
	private int salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Date getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(Date dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String dept, Date dateofjoining, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.dateofjoining = dateofjoining;
		this.age = age;
		this.salary = salary;
	}
	
		
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", dateofjoining=" + dateofjoining
				+ ", age=" + age + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		int result=0;
		if(this.getSalary()>e.getSalary())
		{
			result=1;
		}
		if(this.getSalary()<e.getSalary())
		{
			result=-1;
		}
		if(this.getSalary()==e.getSalary())
		{
			result=0;
			
		}
		// TODO Auto-generated method stub
		return result;
		
		// TODO Auto-generated method stub
		
	
		// TODO Auto-generated method stub
		
	}
	
	
	

}
