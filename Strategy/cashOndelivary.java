package strategy;

public class cashOndelivary implements paymentMode {
	@Override
	public void payment() {
		System.out.println("Succesfully ordered product and you will pay on delivary");
	}
}
