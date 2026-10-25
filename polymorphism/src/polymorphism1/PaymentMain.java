package polymorphism1;

public class PaymentMain {

	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        p1.processPayment();
        if (p1 instanceof CreditCardPayment ) {
        	((CreditCardPayment)p1).verifyCard();
        }
        else {
        	System.out.println("Not a credit card payment");
        }
        p2.processPayment();
        if (p2 instanceof UPIPayment ) {
        	
        	((UPIPayment)p2).verifyUPI();
        }
        else {
        	System.out.println("Not a UPI payment");
        }
	}
}
