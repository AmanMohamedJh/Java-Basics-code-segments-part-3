package strategy;

public class productUI {
	paymentMode payMode;
	refundMode refund;
	
	void setPaymentMode(paymentMode payMode) {
		this.payMode = payMode;
	}
	
	void setRefundMode(refundMode refund) {
		this.refund = refund;
	}
	
	void performPayment() {
		payMode.payment();
	}
	void performRefund() {
		refund.refunds();
	}
}
