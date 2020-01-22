package com.example.hibernate.person.hibernateutil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
	  private static Personservice service;
	  static {
		  service=new Personserviceimp();
	  }
    public static void main( String[] args )throws IOException
    {
    	/*Person p=service.createPerson(new Person("U102","Rahul",LocalDate.now()));
		 System.out.println(p);*/
		/* Person p=service.getPersonByid(1);
		  System.out.println(p);*/
    	BufferedReader br=null;
    	br=new BufferedReader(new InputStreamReader(System.in));
    	int choice=-1;
    	String uId,cname;
    	do {
    		
    	System.out.println("1. create customer.");
   		System.out.println("2. getPersonbyId.");
   		System.out.println("3. update customer.");
   		
   		System.out.println("4. delete customer.");
   		System.out.print("enter your choice>> ");
   		choice=Integer.parseInt(br.readLine());
   		switch (choice) {
		case 1:
			
			Person p=service.createPerson(new Person("U102","Rahul",LocalDate.now()));
			 System.out.println(p);
			
			break;
		case 2:
	
			p=service.getPersonByid(2);
			
			System.out.println(p);
			break;
		case 3:
			p=service.updatePerson(2);
			System.out.println(p);
		case 4:
			service.deletePerson(1);;
			
		default:
			break;
		}
    	}while(choice !=0);
       
    }
}
