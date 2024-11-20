package strategy;

public class myMain {

	public static void main(String[] args) {
		productUI prod = new productUI();
		
		/*paymentMode debitC = new debitCard();
		prod.setPaymentMode(debitC);
		prod.performPayment();
		
		refundMode BT = new bankTransfer();
		prod.setRefundMode(BT);
		prod.performRefund();*/
		
		paymentMode cashon = new cashOndelivary();
		prod.setPaymentMode(cashon);
		prod.performPayment();
		
		refundMode points = new refundPoints(); ;
		prod.setRefundMode(points);
		prod.performRefund();
	}

}
