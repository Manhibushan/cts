package com.example.hibernate.spring.springhibernate;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {

		 
			 try
		      {
		    	  ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		    	  
		    	  UserService dao=context.getBean("service",UserService.class);
		    	  UserDetail e=new UserDetail("3453", "ghjghj", "ghgjk");
		    	    dao.createUser(e); 
		    	 System.out.println(e);
		    	
		      }catch(Exception e)
		      {
		    	  e.printStackTrace();
		      }
      
    }
}
