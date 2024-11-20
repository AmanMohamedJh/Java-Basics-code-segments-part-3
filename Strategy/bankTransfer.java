package strategy;

public class bankTransfer implements refundMode {
	@Override
	public void refunds() {
		System.out.println("Your refund is succesfull through bank transfer");
	}
}
