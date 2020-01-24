package com.example.hibernate.person.onetomany.asssignmentmappingdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException, SQLException
    {
    	BufferedReader br=null;
    	br=new BufferedReader(new InputStreamReader(System.in));
    	int choice=-1;
    	  ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
    	  PostDao dao=context.getBean("pos",PostDao.class);
    	  
    	do {
    		
        	System.out.println("1. create...");
       		System.out.println("2. delete post...");
       		System.out.println("3. delete comment....");
       		System.out.println("4. exit");
       		
       		switch (choice) {
    		case 1:
    	
	      
	    	
	    	  Post temppost = new Post("278","manhi@gmail.com","www.google.com",LocalDate.now());

	    	  Comments tempcomments = new Comments("text",LocalDateTime.now());
			dao.createpost(temppost);
			
    		case 2:
    			
			System.out.println("enter id");
			int id=Integer.parseInt(br.readLine());
			dao.postdelete(id);
    		case 3:
    			System.out.println("enter id");
    			id=Integer.parseInt(br.readLine());
    			dao.commmenttdelete(id);
    		case 4:
    			System.exit(0);
    		default:
    			break;
					
		
					}
    	} while(choice !=0);
    }
}
 


