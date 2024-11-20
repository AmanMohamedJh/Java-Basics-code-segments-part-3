package Singletonpack.example3;

public class Commander {
	private static Commander agent;
	
	private Commander() {
		System.out.println("This is the commander commencing for morning duties the only Commander general");
	}
	
	public static Commander getInstance() {
		if(agent==null) {
			agent= new Commander();
		}
		return agent;
	}
	public static void GiveComments() {
		System.out.println("Command 1 : Stand");
		System.out.println("Command 2 : Straight");
		System.out.println("Command 3 : RUN");
		System.out.println("Command 4 : Stand at ease");
		System.out.println("Command 5 : Jump");
	}
}
