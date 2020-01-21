package com.example.springjdbcdemo.hibernatedemo;






import java.time.LocalDate;

import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 try {
         	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
         			.buildSessionFactory();
         	Session session=factory.openSession();
         	
         	Person person=new Person(UUID.randomUUID().toString(), "John",LocalDate.now());
         	session.getTransaction().begin();
         	session.save(person);
         	session.getTransaction().commit();
         	System.out.println("done");
 			
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
    }
}
