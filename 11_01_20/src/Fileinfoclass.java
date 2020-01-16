import java.io.File;

public class Fileinfoclass {

	public static void main(String[] args) {
		if(args.length<1) {
			System.out.println("provide dummy name as command line argument");
			
			return;
		}
		String fileName=args[0];
		File fn=new File(fileName);
		try
		{
			fn.createNewFile();
			
		}
		catch(Exception e)
		{
			
			
		}
		System.out.println("Name"+fn.getName());
		if(fn.exists())
		{
			System.out.println(fileName+"does exist");
		}
		if(fn.canRead())
		{
			System.out.println(fileName+"is Readable");
			
		}
		System.out.println(fileName+"is"+fn.length()+"bytes long");
		System.out.println(fileName+"is last modified at"+new java.util.Date(fn.lastModified()));
		if(fn.canWrite())
		{
			System.out.println("is writable");
		}
		else
		{
			System.out.println("is not writable");
		}
		}
	
}
