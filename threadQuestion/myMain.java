package threadQuestion;

import java.util.Iterator;

public class myMain {
	
	public static myMain key;

	public static void main(String[] args) {
		key = new myMain();
		Thread1 t1 = new Thread1(key);
		Thread2 t2 = new Thread2(key);

		t1.start();
		t2.start();
	}

}

class Thread1 extends Thread {
	myMain key;
	// run method
	public Thread1(myMain key) {
		this.key = key;
	}

	public void run() {
		synchronized (key) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread 1 runs : " + i);
				
				try {
					key.notify();        ///nofify and wait
					key.wait();
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				
				try {
					Thread1.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}

	}

}

class Thread2 extends Thread {
	myMain key;
	
	public Thread2(myMain key) {
		this.key = key;
	}
	
	public void run() {
		synchronized (key) {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread 2 runs : " + i);
				
				try {
					key.notify();
					key.wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				try {
					Thread2.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}

	}

}
