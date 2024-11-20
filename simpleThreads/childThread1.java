package simpleThreads;

import java.util.Iterator;

public class childThread1 extends Thread {
	public void run() { // 5th thread runs 5 times in loop
		for (int x = 0; x < 5; x++) {
			System.out.println("This is child thread as in 5th thread : " + x);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Error in context switch");
			}
		}
	}
}
