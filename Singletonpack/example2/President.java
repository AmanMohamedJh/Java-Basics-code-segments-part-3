package Singletonpack.example2;

public class President {
	private static President leader; //initializing the variable as static(leader)
	
	private President() {
		System.out.println("New president leader of the country is nominated !");
	}
	
	public static President getInstance() {
		if(leader==null) {
			leader = new President();
		}
		return leader;
	}
	

	
	
	public static void makeSpeech() {
		System.out.println("The president is the 21st leader of the country to win by over 48% votes");
	}
	
}
