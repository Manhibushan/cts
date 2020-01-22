package hibernatemappingbi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Getmain {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().
				configure("hibernate.cfg.xml")
				.addAnnotatedClass(Album.class)
				.addAnnotatedClass(Myimage.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			int theId = 1;
			session.getTransaction().begin();
			Myimage myimage = session.get(Myimage.class, theId);
			session.getTransaction().commit();
			System.out.println("myimage: " + myimage);
			System.out.println("Album " + myimage.getAlbum());
			System.out.println("Done!");
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {

			// session.close();

			factory.close();
		}
	}


}
