package payment.processing.System;

public class PaymentProcessor {
	public void process(PaymentMethod method) {
		method.pay();
		method.calculateFee();
	}
	public void process(PaymentMethod method,String transactionId) {
		System.out.println("Transaction ID : "+ transactionId);
		method.pay();
		method.calculateFee();
	}
}
