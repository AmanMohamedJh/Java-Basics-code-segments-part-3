package strategy;

public class refundPoints implements refundMode {
	@Override
	public void refunds() {
		System.out.println("Your refund for the product has credited as refund points . you may use it later");
	}
}
