package synch;

public class Producer extends Thread {
	 private Cubbyhole cubbyhole;
	    private int number;

	    public Producer(Cubbyhole c, int number) {
	        cubbyhole = c;
	        this.number = number;
	    }

	    public void run() {
	        for (int i = 0; i < 10; i++) {
	            cubbyhole.put(number, i);
	            try {
	                sleep((int)(Math.random() * 100));
	            } catch (InterruptedException e) { }
	        }
	

}
}