package TemplatePattern2;

public class creditCard extends PurchuseProduct{

	@Override
	void selectPaymentMode() {
		System.out.println("SELECTED CREDIT CARD AS PAYMENT MODE");
		
	}

	@Override
	void enterCardNumber() {
		System.out.println("ENTERED THE CREDIT CARD NUMBER");
		
	}

	@Override
	void enterCVCnumber() {
		System.out.println("ENTERED THE CREDIT CARD CVC NUMBER");
		
	}

}
