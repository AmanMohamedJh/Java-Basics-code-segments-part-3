package TemplatePattern2;

public class debitCard extends PurchuseProduct {

	@Override
	void selectPaymentMode() {
		System.out.println("SELECTED DEBIT CARD AS PAYMENT MODE");
		
	}

	@Override
	void enterCardNumber() {
		System.out.println("ENTERED THE DEBIT CARD NUMBER");
		
	}

	@Override
	void enterCVCnumber() {
		System.out.println("ENTERED THE DEBIT CARD CVC NUMBER");
		
	}

}
