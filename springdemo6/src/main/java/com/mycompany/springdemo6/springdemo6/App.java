package com.mycompany.springdemo6.springdemo6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Customerservice service;
	static {
		service = new Customerserviceimp();
	}

	
  
    	

		public static void main(String args[]) throws NumberFormatException,IOException,SQLException {
			 try
		      {
		    	  ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		    	  CustomerDao dao=context.getBean("dao",CustomerDao.class);
		    	 
		    	
		      }catch(Exception e)
		      {
		    	  e.printStackTrace();
		      }
			int choice = 0;
			String fName,lName,email,uId;
			List<Customer> list=null;
			Customer customer=null;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.println("======================\n1. create customer");
				System.out.println("2. display all customers");
				System.out.println("3. find customer by id");
				System.out.println("4. update customer");
				System.out.println("5. delete customer");
				System.out.println("0. exit");
				System.out.print("choice: ");
				choice = Integer.parseInt(br.readLine().toString());
				switch (choice) {
				case 1:
					System.out.print(" First Name: ");
					fName=br.readLine().toString();
					System.out.print(" Last Name: ");
					lName=br.readLine().toString();
					System.out.print(" Email: ");
					email=br.readLine().toString();
					String arr[]=UUID.randomUUID().toString().split("-");
					
					break;
				case 3:
					System.out.print(" UID: ");
					uId=br.readLine().toString();
					list=service.findById(uId);
					if(list.isEmpty())
					{
						System.out.println("no such uid found");
					}
					else {
						Customer c=list.get(0);
						System.out.println("customer found: "+c);
					}
					break;
				case 2:
					list=service.getAllCustomers();
					System.out.format("%-20s%-20s%-20s%-20s\n","ID",
							"FIRST_NAME","LAST_NAME","EMAIL");
					list.forEach(c->{
						System.out.format("%-20s%-20s%-20s%-20s\n",c.getUId()
								,c.getFName(),c.getLname(),c.getEmail());
					});
					break;
				case 4:
					System.out.print(" UID : ");
					uId=br.readLine().toString();
					list=service.findById(uId);
					if(list.isEmpty())
					{
						System.out.println("no such uid found");
					}
					else {
						Customer c=list.get(0);
						System.out.print(" First Name: ");
						fName=br.readLine().toString();
						System.out.print(" Last Name: ");
						lName=br.readLine().toString();
						System.out.print(" Email: ");
						email=br.readLine().toString();
						c.setEmail(email);
						c.setFName(fName);
						c.setLname(lName);
						customer=service.updateCustomer(c,c.getUId());
						System.out.println("customer updated: "+customer);
					}
					break;
				case 5:
					System.out.print(" UID : ");
				uId=br.readLine().toString();
				list=service.findById(uId);
				if(list.isEmpty())
				{
					System.out.println("no such uid found");
				}
				else {
					service.deleteCustomer(uId);
					System.out.println("deletion sucessfull");
					
				}
				break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("invalid choice");
					break;
				}

			} while (choice != 0);

		}

    }

