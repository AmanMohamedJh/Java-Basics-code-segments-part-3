package singltonpractice2_doubleLock;

public class mySinglton {
	private static mySinglton variable;

	private mySinglton() {

	}

	public static mySinglton getVariable() {
		if (variable == null) {  //checking whether variable is null at first place
			synchronized (mySinglton.class) {   //then we create a class in mySinglton with sync
				if (variable == null) {				//then with sync again check whether its null
					variable = new mySinglton();   		//then only create the object in mtySinglton
				}
			}

		}
		return variable;
	}

	public static void objectOne() {
		System.out.println("Object 1");
	}

	public static void objectTwo() {
		System.out.println("Object 2");
	}

	public static void objectThree() {
		System.out.println("Object 3");
	}

	public static void objectFour() {
		System.out.println("Object 4");
	}

}
