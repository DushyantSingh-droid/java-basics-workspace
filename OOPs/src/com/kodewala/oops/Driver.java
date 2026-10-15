package com.kodewala.oops;

public class Driver {
	public static void main(String args[]) {
		Payment payment = new Payment(1000);
		payment.doCredit(55);
		System.out.println(payment.getBalance());
	}
}
