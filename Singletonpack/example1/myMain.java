package Singletonpack.example1;

public class myMain {

	public static void main(String[] args) {
		
		//mySinglton ob = new mySinglton();//--this is wrong bcs the constructor is private
		
		mySinglton.getInstance();
		
		mySinglton.showmsg();
		
	}

}
