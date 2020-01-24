package com.example.hibernate.person.onetomany.asssignmentmappingdemo;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
    	SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml").addAnnotatedClass(Post.class)
				.addAnnotatedClass(Comments.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
	
    	try
    	{
    		
    		
    	Post post = new Post("567","manhi","www",LocalDate.now());
	
		post.getComments().add(new Comments("text", LocalDateTime.now()));
		session.getTransaction().begin();
		session.save(post);
		session.getTransaction().commit();
		System.out.println("done");
    	
		
		//System.out.print("enter comment id:");
	/*	int id=1;
		session.getTransaction().begin();
		Comments c = session.get(Comments.class, id);
		
		
		session.delete(c);
		session.getTransaction().commit();
		System.out.println("done");*/
		} catch(Exception e)
    	{
			e.printStackTrace();
		}
	}
    }

