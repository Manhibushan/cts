package hibernatemappingbi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class App {
	private static AlbumDao dao;
	static {
		dao=new AlbumDaoimp();
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=null;
    	br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1.create");
		System.out.println("2 find by id");
		System.out.println("3.update");
		System.out.println("4.Delete");
		
		int choice=-1;
		choice=Integer.parseInt(br.readLine());
		
		switch (choice) {
		case 1:
			
			Album a=dao.create(new Album());
			System.out.println("done");	
		
			break;
		case 2:
			System.out.println("Enter id");
		int	id=Integer.parseInt(br.readLine());
		dao.findbyId(id);
		break;
		case 3:
			System.out.println("enter id");
			id=Integer.parseInt(br.readLine());
			dao.update(id);
			break;
		case 4:
			//System.out.println("enter id");
			//id=Integer.parseInt(br.readLine());
				dao.delete(1);
				break;
				
				
		

		default:
			break;
		}
		}
		
		/*Album album=new Album("picsart",LocalDate.now());
		album.setMyimage(new Myimage("www.picsart.com"));
		session.getTransaction().begin();
		session.save(album);
		session.getTransaction().commit();
		}*/
		
	
	}
	

