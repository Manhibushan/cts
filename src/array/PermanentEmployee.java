package array;

import java.time.LocalDate;
import java.util.UUID;

public class PermanentEmployee extends Employee {
		private double salary;

		public PermanentEmployee()
		{
			super();
		}

		public PermanentEmployee(String employeeId, String employeeName, LocalDate dateOfjoining,double salary) {
			super(employeeId, employeeName, dateOfjoining);
			//super(UUID.randomUUID().toString(),"John",LocalDate.now());
			this.salary=salary;
			
		}

		@Override
		public String getDetails() {
			
			return super.getDetails()+" Salary: "+salary;
		}
		
		public void A()
		{
			
		}

}
