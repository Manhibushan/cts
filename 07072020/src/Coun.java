
public class Coun {
	private static Integer count;
	private String temp;
	
	private  int MAX;
	
	
	class InnerCounter{
		
		public void add(int a,int b)
		{
			System.out.println("\n"+(a+b));
		}
	}
	
	public Coun() {
		super();
		MAX=1000;
	}
	

	
	static {
		count = 0;
	}

	public Coun(String temp) {
		super();
		MAX=100;
		count++;
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "Count of object is: " + temp + count;
	}

	public static String displayCount() {
		return count.toString();
	}
	
	public void displayMAX()
	{
		System.out.println(MAX);
	}

}
