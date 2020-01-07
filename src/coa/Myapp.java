package coa;

import java.time.LocalDate;
import java.util.UUID;

public class Myapp {
	public static void main(String[] args) {
	//	Coach myCoach1=new Coach(UUID.randomUUID().toString()
		//		,"John","Doe","Cricket");
		//Coach myCoach2=new Coach(UUID.randomUUID().toString()
			//	,"John","Doe","Cricket");
		//System.out.println("Coach1 Details: \n"+myCoach1+"\nCoach2 Details: \n"+myCoach2);
		//System.out.println(myCoach1==myCoach2);
		//System.out.println(myCoach1.equals(myCoach2));
		
		
		
		Task task1=new Task(UUID.randomUUID().toString(),"java",LocalDate.now(),true);
		Task task2=new Task(UUID.randomUUID().toString(),"java",LocalDate.now(),true);
		System.out.println("Task Details: \n"+task1+"\nTask Details: \n"+task2);
		System.out.println(task1==task2);
		System.out.println(task1.equals(task2));
		
	}


}
