package com.my.springdemo3.springdemo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.springdemo3.springdemo4.bean.Task;
import com.my.springdemo3.springdemo4.bean.Todo;

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
    	   Todo todo=context.getBean("todo",Todo.class);
    	   Task task=context.getBean("tas",Task.class);
    	   task.setTaskId("2378");
    	   task.setTaskName("learning java");
    	   todo.setTask(task);
    	   
    		System.out.println(todo);
    	   
       }catch(Exception e)
       {
    	   e.printStackTrace();
       }
    }
}
