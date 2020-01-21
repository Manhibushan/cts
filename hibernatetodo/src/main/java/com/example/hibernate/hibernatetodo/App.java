package com.example.hibernate.hibernatetodo;

import java.time.LocalDateTime;
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
       SessionFactory sessionfactory=null;
       Session session=null;
       try {
    	   sessionfactory=new Configuration().configure().addAnnotatedClass(Todo.class).buildSessionFactory();
    	   session=sessionfactory.openSession();
    	   Todo todo=new Todo();
    	  
    	   todo.setUId(UUID.randomUUID().toString());
    	   todo.setTodoName("java");
    	   todo.setDatetime(LocalDateTime.now());
    	   session.getTransaction().begin();
    	   session.save(todo);
    	   session.getTransaction().commit();
    	   
       }catch(Exception e)
       {
    	   e.printStackTrace();
       }
       finally {
   		session.close();
   		sessionfactory.close();
   	}
       
    }
}
