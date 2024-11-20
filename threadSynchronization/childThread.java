package threadSynchronization;

public class childThread extends Thread {
	Screen obj; //reference for an object of Screen class
	String msg; //variable initialized as msg 

	 
	public childThread(Screen obj, String msg) { //take constructors to send the variables to Screen.java
		super();
		this.obj = obj;
		this.msg = msg;
		start(); //here start the thread run function below
		
	}
	public void run() {
		obj.display(msg);
	}
	
}
