package THread;

import java.util.Iterator;

public class childThread1 extends Thread{
	public void run(){
		for(int x=0;x<10;x++) {
			System.out.println("This is child thread : "+x);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Error in context switch");
			}
		}
	}
}
