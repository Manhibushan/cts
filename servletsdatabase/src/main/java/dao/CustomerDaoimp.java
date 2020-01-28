package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.hibernate.Session;


import com.util.Customerutil;

import model.Customer;



public class CustomerDaoimp implements CustomerDao{
	private Session session;
	private EntityManager entitymanager;
	{
		session=Customerutil.getMysessionfactory().openSession();
				session.getTransaction().begin();
		entitymanager=session.getEntityManagerFactory().createEntityManager();
		session.getTransaction().commit();
	}
	@Override
	public Customer createCustomer(Customer customer) {
		entitymanager.getTransaction().begin();
		entitymanager.persist(customer);
		
		entitymanager.getTransaction().commit();
		return customer;
	}
	@Override
	public List<Customer> getAllCustomer() {
	Query query=entitymanager.createQuery("from Customer",Customer.class);
			
		 return query.getResultList();
	}
}
	
	
	

	
	
	
	
	
	

	
