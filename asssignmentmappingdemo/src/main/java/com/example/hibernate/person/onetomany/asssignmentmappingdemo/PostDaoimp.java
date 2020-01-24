package com.example.hibernate.person.onetomany.asssignmentmappingdemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
@Repository("pos")

public class PostDaoimp implements PostDao {

	private SessionFactory sessionFactory;
	private Session session;
	
	
	
	
	
	public PostDaoimp(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
		session = sessionFactory.openSession();
	}





	@Override
	@Transactional
	public Post createpost(Post post) {
		session.save(post);
		// TODO Auto-generated method stub
		return post;
	}










	@Override
	public void postdelete(int id) throws SQLException {
		session.getTransaction().begin();
		Post p = session.get(Post.class, id);
		
		
		session.delete(p);
		session.getTransaction().commit();
		System.out.println("done");
		
	}





	@Override
	public void commmenttdelete(int id) throws SQLException {
		session.getTransaction().begin();
		Comments c = session.get(Comments.class, id);
		
		
		session.delete(c);
		session.getTransaction().commit();
		System.out.println("done");
		// TODO Auto-generated method stub
		
	}





	

}
