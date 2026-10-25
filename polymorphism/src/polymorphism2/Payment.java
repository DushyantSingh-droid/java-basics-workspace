package polymorphism2;

public class Payment {
public void doPayment() {
	System.out.println("general payment");
}
}
class UPI extends Payment{
	@Override
	public void doPayment() {
		System.out.println("UPI payment");
	}
	public void showReceipt() {
		System.out.println("Printing reciept");
	}
}
class CreditCardPayment extends Payment{
	@Override 
	public void doPayment() {
		System.out.println("Credit Card Payment");
	}

}
class Cash extends Payment{
	@Override
	public void doPayment() {
		System.out.println("cash Payment");
	}
}