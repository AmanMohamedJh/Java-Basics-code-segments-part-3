package threadSynchronization;

public class Screen {
	public synchronized void  display(String msg) {
		System.out.print("["+msg);//it will print like this [msg] if synchornization is on
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
