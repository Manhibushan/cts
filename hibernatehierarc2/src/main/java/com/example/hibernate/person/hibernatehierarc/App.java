package com.example.hibernate.person.hibernatehierarc;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    		
    		Session session=null;
    		try {
    			
    			session=new Configuration().configure("hibernate.cfg.xml")
    					.addAnnotatedClass(Employee.class)
    					.addAnnotatedClass(REmployee.class)
    					.addAnnotatedClass(CEmployee.class).buildSessionFactory()
    					.getCurrentSession();
    			Employee e1=new Employee("John", LocalDate.now());
    			Employee e2=new REmployee("Doe",LocalDate.now(),"5000");
    			Employee e3=new CEmployee("author-1", LocalDate.now(),"50");
    		session.getTransaction().begin();
    			session.save(e1);
    			session.save(e2);
    			session.save(e3);
    			session.getTransaction().commit();
    			System.out.println("done");
    		} finally {
    			//session.close();
    		}

    	}

    }

