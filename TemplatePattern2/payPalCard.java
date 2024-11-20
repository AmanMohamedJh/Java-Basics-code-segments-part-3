package TemplatePattern2;

public class payPalCard extends PurchuseProduct{

	@Override
	void selectPaymentMode() {
		System.out.println("SELECTED PAYPAL CARD AS PAYMENT MODE");
		
	}

	@Override
	void enterCardNumber() {
		System.out.println("ENTERED THE PAYPAL CARD NUMBER");
		
	}

	@Override
	void enterCVCnumber() {
		System.out.println("ENTERED THE PAYPAL CARD CVC NUMBER");
		
	}

}
