package polymorphism2;

public class User {

	public static void main(String[] args) {
		PaymentProcessor p1 = new PaymentProcessor();
		
		CreditCardPayment creditCardPaymnet = new CreditCardPayment();
		p1.process(creditCardPaymnet);
		
		UPI upi = new UPI();
		p1.process(upi);
		upi.showReceipt();
		
		Cash cash = new Cash();
		p1.process(cash);

	}

}
