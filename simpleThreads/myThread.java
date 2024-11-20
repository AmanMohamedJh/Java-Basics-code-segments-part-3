package simpleThreads;

public class myThread extends Thread{

	public static void main(String[] args) { //1st thread//
		myThread ch = new myThread();//2nd thread
		ch.start();
		
		myThread ch1 = new myThread();//3rd thread
		ch1.start();
		
		myThread ch2 = new myThread();//4th thread
		ch2.start();
		
		childThread1 ch3 = new childThread1();//5th thread
		ch3.start();
		
		for (int x = 0; x < 10; x++) {
			System.out.println("This is main thread : "+x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Error in context switch");
			}
		}

	}
	
	public void run(){ //1st , 2nd , 3rd , 4th
		childThread1 ch4 = new childThread1();//1st thread - 6th thread
		ch4.start();						  //2nd thread - 7th thread
											  //3rd thread - 8th thread
											  //4th thread - 9th thread
		
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
