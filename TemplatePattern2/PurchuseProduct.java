package TemplatePattern2;

public abstract class PurchuseProduct {
	
	final void purchuse() {
		searchProduct(); //purchuse
		selectColor();	//purchuse
		selectSize();	//purchuse
		PressBuy();		//purchuse
		selectPaymentMode();  //cards
		enterCardNumber();	//cards
		enterCVCnumber();	//cards
		completePurchuse();  //purchuse
		
	}
	void searchProduct() {
		System.out.println("SEARCHED FOR THE PRODUCT(T-Shirt)");
		
	}
	void selectColor() {
		System.out.println("SEARCHED FOR THE COLOUR (BLACK COLOR T-SHIRT)");
	}
	
	void selectSize() {
		System.out.println("SEARCHED FOR THE SIZE (LARGE BLACK T-SHIRT)");
	}
	
	void PressBuy() {
		System.out.println("Pressed buy button to purchuse");
	}
	
	abstract void selectPaymentMode();
	abstract void enterCardNumber();
	abstract void enterCVCnumber(); 
	
	void completePurchuse() {
		System.out.println("Completed the purchuse of the Black large sized T-shirt");
	}
	
}
