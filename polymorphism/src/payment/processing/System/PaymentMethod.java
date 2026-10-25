package payment.processing.System;

public class PaymentMethod {
	private String customerName;
	private double amount;
	static int totalPayments;
	public PaymentMethod(String customerName,double amount){
		if(customerName == null || customerName.trim().isEmpty()) {
			throw new IllegalArgumentException("Customer name can not be null or Empty");
		}
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount can not be negative or zero");
		}
		this.customerName = customerName;
		this.amount = amount;
		totalPayments++;
		System.out.println("------------>*******<-------------");
	}
	public double getAmount() {
		return amount;
	}
	public String getCustomerName() {
		return customerName;
	}
    public static int getTotalPayments() {
    	return totalPayments;
    } 	
	public void pay() {
		System.out.println("generic payments message");
	}
	public double calculateFee() {
		return amount * 2 /100;
	}
}
