package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main1 {
	public static void main(String[] args)throws IOException,ParseException
	{
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input the number of employee");
		int n=Integer.parseInt(br.readLine());
		List<Employee>employeelist=new ArrayList<Employee>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Employee Details"+(i+1));
			String name=br.readLine();
			String Department=br.readLine();
			Date dateOfJoining=new SimpleDateFormat("MM/dd/yyyy").parse(br.readLine());
			int age=Integer.parseInt(br.readLine());
			int salary=Integer.parseInt(br.readLine());
			Employee e=new Employee(name,Department,dateOfJoining,age,salary);
			employeelist.add(e);
		}
		
		System.out.println("1.Sort employees by salary");
		System.out.println("2.Sort employees by age and by date of joining");
		System.out.println("Enter your choice");
		int choice=Integer.parseInt(br.readLine());
		switch(choice)
		{
		case 1:
			Collections.sort(employeelist);
			EmployeeBo.printemployee(employeelist);
			break;
		case 2:
			Collections.sort(employeelist,new AgeComparator());
			EmployeeBo.printemployee(employeelist);
			
			
		}
			
			
			
		}
		
				
	}


