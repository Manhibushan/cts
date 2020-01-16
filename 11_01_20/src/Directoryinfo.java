import java.io.File;

public class Directoryinfo {
	public static void main(String[] args)
	{
		System.out.println("creating a temp directory");
		String fileName="temp";
		File fn=new File(fileName);
		fn.mkdir();
		File subdir1=new File(fn,"subdir1");
		subdir1.mkdir();
		File subdir2=new File(fn,"subdir2");
		subdir2.mkdir();
		System.out.println(fileName+ "is a" +(fn.isFile()? "File":"Directory"));
		if(fn.isDirectory())
		{
			String content[]=fn.list();
			System.out.println("the content of this Directory is");
			for(int i=0;i<content.length;i++)
			{
				System.out.println(content[i]);
				
			}
		}
		  System.out.println(fileName +
	                (fn.exists()? " exists": " does not exist"));
	        System.out.println("Deleting temp directory...");
	        fn.delete();
		
	}

}
