package Singletonpack.example1;

public class mySinglton {
	private static mySinglton instance; //referencing the static class
										//when declaring the static class its always == Null
	
	private mySinglton(){ //default constructor for the class //and its private 
							//if we make this as private--> it means it only allow us 1 output using this sington function//
	}
	public static mySinglton getInstance() {
		if(instance == null) {
			instance = new mySinglton();
		}
		return instance;
		
	}
	public static void showmsg() {
		System.out.println("WE are in singlton universe !! ");
	}
}
