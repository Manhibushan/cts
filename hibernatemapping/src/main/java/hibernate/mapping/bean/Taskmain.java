package hibernate.mapping.bean;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Taskmain {
	public static void main(String[] args)
	{
		try
		{
			SessionFactory factory=new Configuration()
					.configure().addAnnotatedClass(Task.class)
					.addAnnotatedClass(Todo.class).buildSessionFactory();
			Session session=factory.openSession();
			Task task=new Task("learning java");
			task.setTodo(new Todo("hibernate",LocalDate.now(),true));
			session.getTransaction().begin();
			session.save(task);
			session.getTransaction().commit();
		}
		catch (Exception e) {
			e.printStackTrace();
	}

}
}
