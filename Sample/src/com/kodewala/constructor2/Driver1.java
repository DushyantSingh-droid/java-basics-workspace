package com.kodewala.constructor2;

public class Driver1 {
	public static void main (String args[]) {
		PaymentService paymentService = new PaymentService();
		paymentService.makePayment("upi");
		paymentService.makePayment("card");
		paymentService.makePayment("cash");
	}
}
