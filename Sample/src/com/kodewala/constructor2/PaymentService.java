package com.kodewala.constructor2;

public class PaymentService {
	public void makePayment(String _paymentType) {
		System.out.println("PaymentService.makePayment");
		
		if(_paymentType.equalsIgnoreCase("upi"))
		{
			makeUPIPayment();
		}
		else if(_paymentType.equalsIgnoreCase("card"))
		{
			makeCardPayment();
		}
		else
		{
			makeCashPayment();
		}
	}
	
	private void makeUPIPayment()
	{
		System.out.println("PaymentService.makeUPIPayment() START ");
		// BIZ Logic
		System.out.println("PaymentService.makeUPIPayment() END ");
	}
	private void makeCardPayment()
	{
		System.out.println("PaymentService.makeCardPayment() START ");
		// BIZ Logic
		System.out.println("PaymentService.makeCardPayment() END ");
	}
	private void makeCashPayment()
	{
		System.out.println("PaymentService.makeCashPayment() START ");
		// BIZ Logic
		System.out.println("PaymentService.makeCashPayment() END ");
	}
}
