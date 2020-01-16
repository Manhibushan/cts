package Assignment;

import java.util.List;

public class EmployeeBo {
	public static void printemployee(List<Employee>employeelist)
	{
		System.out.format("%-15s %-30s %-30s %-10s %-10s\n", "id","name","dept","date of joining","age","salary");
		for(Employee e:employeelist)
		{
			System.out.println(e);
		}
	}

}
