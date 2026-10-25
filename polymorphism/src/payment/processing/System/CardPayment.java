package payment.processing.System;

public class CardPayment extends PaymentMethod {
	CardPayment(String customerName,double amount){
		super(customerName,amount);
	}
	@Override
	public void pay() {
		System.out.println("Card Payment");
	}
	@Override
	public double calculateFee() {
		return getAmount() * 3 / 100;
	}
	public void requestChargeBack() {
		System.out.println("Requesting a chargeback");
	}
}
