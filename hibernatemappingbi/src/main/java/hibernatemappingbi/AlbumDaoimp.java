package hibernatemappingbi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;








public class AlbumDaoimp implements AlbumDao  {
	private Session session;
	private Transaction transaction;
	
	
	private static BufferedReader br;
	private static SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class)
			.addAnnotatedClass(Myimage.class).buildSessionFactory();

	static
	{
				br=new BufferedReader(new InputStreamReader(System.in));
				

				

	}


	@Override
	public Album create(Album album)throws IOException
	{
		
		Session session = factory.getCurrentSession();

		
			System.out.println("Enter name");
			String name=br.readLine();

			Album tempalbum = new Album(name, LocalDate.now());

			 Myimage tempmyimage = new Myimage("http://www.youtube.com");

			tempalbum.setMyimage(tempmyimage);

			session.beginTransaction();

			System.out.println("Saving instructor: " + tempalbum );
			session.save(tempalbum);

			session.getTransaction().commit();

			System.out.println("Done!");
		
		return album;
	}

	@Override
	public Album findbyId(Integer id) {
		 factory = new Configuration().
				configure("hibernate.cfg.xml")
				.addAnnotatedClass(Album.class)
				.addAnnotatedClass(Myimage.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			
			session.getTransaction().begin();
			Myimage myimage= session.get(Myimage.class, id);
			session.getTransaction().commit();
			System.out.println("tempmyimage: " +myimage);
			//System.out.println("the associated Album: " + myimage.getAlbum());
			System.out.println("Done!");
			
			System.out.println("Done!");
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {

			// session.close();

			factory.close();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Album update(Integer id) throws IOException {
		 Album a=session.get(Album.class, id);
		if(a!=null)
		{
			System.out.println("Name: ");
			String name=br.readLine();
			a.setImgname(name);
			a.setDate(LocalDate.now());
			session.getTransaction().begin();
			session.update(a);
			session.getTransaction().commit();
		}
		else
		{
			System.out.println("not found");
		}
		return a;
	}
	

	@Override
	public void delete(Integer id) {
		
		Album a=session.get(Album.class, id);
		if(a!=null)
		{
			session.getTransaction().begin();
			session.delete(a);
			session.getTransaction().commit();
			System.out.println("deleted.");
		}
		else
		{
			System.out.println("not found");
		}
		
	}
}