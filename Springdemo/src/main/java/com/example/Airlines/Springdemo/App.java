package com.example.Airlines.Springdemo;

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
        	Coach coach=context.getBean("theCoach",Coach.class);
        	System.out.println(coach.getDailyFortune());
        	System.out.println(coach.getDailyWorkout());
        }catch(Exception e)
        {
        	e.printStackTrace();
        	        }
        
    }
}
