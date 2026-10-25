package abstract1;

public class PaymentMain {

	public static void main(String[] args) {
		CreditCardPayment c1 = new CreditCardPayment();
		c1.pay(1000);
		UpiPayment u1 = new UpiPayment();
		u1.pay(7000);

	}

}
