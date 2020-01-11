package unsyn;

public class Producerconsumer {

	public static void main(String[] args) {
		Cubbyhole c=new Cubbyhole();
		
		Producer p1=new Producer(c,1);
		Consumer c1=new Consumer(c,1);
		p1.start();
		
		
		
	}

}
