package Sync;

public class Producer implements Runnable {
	private SyncStack thestack;
	private int num;
	private static int counter = 1;

	public Producer(SyncStack s) {
		thestack = s;
		num = counter++;
	}

	public void run() {
		char c;

		for (int i = 0; i < 20; i++) {
			c = (char) (Math.random() * 26 + 'A');
			thestack.push(c);
			System.out.println("Producer" + num + ":" + c);
			try {
				Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {

			}
		}
	}

}
