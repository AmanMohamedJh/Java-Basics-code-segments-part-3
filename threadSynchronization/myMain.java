package threadSynchronization;

public class myMain {

	public static void main(String[] args) {
		 
		Screen sc = new Screen();
		
		childThread t1 = new childThread(sc, "Hello");
		childThread t2 = new childThread(sc, "welcome");
		childThread t3 = new childThread(sc, "aman");

	}

}
