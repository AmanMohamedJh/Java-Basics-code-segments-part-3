package singltonPractice1;

public class mySinglton1 {
	private static mySinglton1 instance;
	
	private mySinglton1() {
		
	}
	
	public static mySinglton1 getInsta() {
		
		if(instance == null) {
			instance=new mySinglton1();
		}
		return instance;
	}
	
	public static void gether() {
		System.out.println("Got her !! ");
	}

}
