package payment.processing.System;

public class UPIPayment extends PaymentMethod {
	private String upiId;
	public UPIPayment(String customerName,double amount,String upiId) {
		super(customerName,amount);
		this.upiId = upiId;
	}
	@Override
	public void pay() {
		System.out.println("Upi payment");
	}
	@Override
	public double calculateFee() {
		return getAmount()*1*100;
	}
    public void displayUpiId() {
    	System.out.println("UPI ID : "+ upiId);
    }
}
