package polymorphism1;

public class Payment {
	public void processPayment() {
		System.out.println("Processing general payment");
	}
}
class CreditCardPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment");
	}
	public void verifyCard() {
		System.out.println("Verifying credit card");
	}
}
class UPIPayment extends Payment {
	@Override
	public void processPayment() {
		System.out.println("processing UPI payment");
	}
	public void verifyUPI() {
		System.out.println("Verifying UPI ID");
	}
}