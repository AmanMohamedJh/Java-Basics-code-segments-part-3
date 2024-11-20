package TemplatePattern2;

public class myMain {

	static PurchuseProduct purchuse;

	public static void main(String[] args) {
		
		System.out.println("---------BUY THE PRODUCT YOUU WANT!!! ---------- ");
		PurchuseProduct debit = new debitCard();
		debit.purchuse();
		
		System.out.println();
		System.out.println("---------BUY THE PRODUCT YOUU WANT!!! ---------- ");
		PurchuseProduct credit = new creditCard();
		credit.purchuse();
	}

}
