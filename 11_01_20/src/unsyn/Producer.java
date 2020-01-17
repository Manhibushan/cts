package unsyn;

public class Producer extends Thread {
	private Cubbyhole cubbyhole;
	private int number;
	public Producer(Cubbyhole c, int number) {
		super();
		cubbyhole = c;
		this.number = number;
	}
public void run()
{
	for(int i=0;i<10;i++)
	{
		cubbyhole.put(i);
		System.out.println("producer #"+this.number+ "put"+i);
		try {
			sleep((int)(Math.random()*100));
		} catch(InterruptedException e) {
			
		}
		
		
	}
}
}
