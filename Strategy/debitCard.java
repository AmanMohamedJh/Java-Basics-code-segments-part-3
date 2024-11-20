package strategy;

public class debitCard implements paymentMode{
	@Override
	public void payment() {
		System.out.println("Successfully done payment using debit card");
		
	}
}
