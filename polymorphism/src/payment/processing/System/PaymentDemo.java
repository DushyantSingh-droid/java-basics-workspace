package payment.processing.System;

public class PaymentDemo {

	public static void main(String[] args) {
		PaymentProcessor pp = new PaymentProcessor();

		PaymentMethod[] paymentMethod = { new CardPayment("Dushyant", 1000), new UPIPayment("Jatin", 1000, "UPI9089"),
				new WalletPayment("Abhay", 970) };
		for (int i = 0; i < paymentMethod.length; i++) {
			pp.process(paymentMethod[i]);
		}

		pp.process(paymentMethod[0], "TXN101");
		PaymentMethod p1 = new CardPayment("Bhanu", 1000);
		if (p1 instanceof CardPayment) {
			CardPayment x = (CardPayment) p1;
			x.requestChargeBack();
			System.out.println("Fees on txn : " + x.calculateFee());
		}
		PaymentMethod p2 = new UPIPayment("Bhanu", 1000,"upi79078860");
		if (p2 instanceof UPIPayment) {
			UPIPayment y = (UPIPayment) p2;
			y.displayUpiId();
			System.out.println("Fees on txn : " + y.calculateFee());
			
		}
		System.out.println("Total no. of payments :"+PaymentMethod.getTotalPayments());
	}

}
