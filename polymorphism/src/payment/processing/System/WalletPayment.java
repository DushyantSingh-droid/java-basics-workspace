package payment.processing.System;

public class WalletPayment extends PaymentMethod{
	public WalletPayment(String customerName, double amount) {
		super(customerName,amount);
	}
	@Override 
	public void pay() {
		System.out.println("Wallet Payment");
	}
	@Override 
	public double calculateFee () {
		return getAmount() * 1.5 / 100;
		}
}
