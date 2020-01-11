package Sync;

public class Consumer implements Runnable {
private SyncStack thestack;
private int num;
private static int counter=1;
public Consumer(SyncStack s) {
	thestack = s;
	num = counter++;
}

public void run() {
	char c;
	for (int i = 0; i < 20; i++) {
		c = thestack.pop();
		System.out.println("Consumer" + num + ":" + c);

		try {
			Thread.sleep((int) (Math.random() * 300));
		} catch (InterruptedException e) {

		}
	}
}

}
