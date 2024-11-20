package ThreadQuPP;

class ResourceManager {

	private int res = 0;

	public ResourceManager(int res) {
		this.res = res;
	}

	public synchronized void requestResource(int uid) {
		if (res > 0) {
			System.out.println("User " + uid + " acquires " + res);
			res--;
		} else {
			System.out.println("User " + uid + " is waiting for resource");
		}
	}

	public synchronized void releaseResource(int uid) {
		System.out.println("User " + uid + " releases resource " + res);
		res++;
	}

}

class User extends Thread {
	private ResourceManager rsm;
	private int uid;

	public User(ResourceManager rsm, int uid) {
		this.rsm = rsm;
		this.uid = uid;
	}

	public void run() {
		rsm.requestResource(uid);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		rsm.releaseResource(uid);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

public class Question3 {
	public static void main(String[] args) {

		ResourceManager rsm = new ResourceManager(3);

		for (int i = 0; i < 5; i++) {
			User u = new User(rsm, i);
			u.start();
			
		}

	}

}
