package THread;

public class myThread {

	public static void main(String[] args) {
		childThread1 ch = new childThread1();
		ch.start();
		
		for (int x = 0; x < 10; x++) {
			System.out.println("This is main thread : "+x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Error in context switch");
			}
		}

	}

}

