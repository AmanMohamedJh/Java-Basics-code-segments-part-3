package singltonpractice2_doubleLock;

public class myMain {

	public static void main(String[] args) {
		mySinglton.getVariable();
		mySinglton.objectOne();
		mySinglton.objectTwo();
		mySinglton.objectThree();
		mySinglton.objectFour();

	}

}
