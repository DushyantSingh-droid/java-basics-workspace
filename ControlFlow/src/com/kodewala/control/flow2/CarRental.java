package com.kodewala.control.flow2;

public class CarRental {
	public int calculateRental(char carType, int days) {
		String car;
		int price = 0;
		int discount = 0;
		// ------Checking for invalid inputs -------------
		if (days <= 0) {
			return -1;
		}
		// ------------ Switch case -------------
		switch (carType) {

		case 'A':
			car = "Economy";

			price = 1500;
			break;
		case 'B':
			car = "Sedan";
			price = 2500;
			break;
		case 'C':
			car = "SUV";
			price = 3500;
			break;
		case 'D':
			car = "Luxury";
			price = 5000;
			break;
		default:
			return -2;
		}
		// -------------Checking for Discounts -----------------
		int total = price * days;
		if (days >= 5 && car.equals("Economy")) {
			discount = total * 10 / 100;
		} else if (days >= 7 && car.equals("Sedan")) {
			discount = total * 15 / 100;
			if (discount > 3000) {
				discount = 3000;
			}
		} else if (days >= 10 && car.equals("SUV")) {
			discount = total * 20 / 100;
			if (discount > 5000) {
				discount = 5000;
			}
		} else {
			return total;
		}
		// --------------Calculating final price after discount -------------
		int finalBill = total - discount;
		System.out.println("Price after dicont is : " + finalBill);
		return finalBill;
	}

	public static void main(String args[]) {
		CarRental c1 = new CarRental();
		String type = args[0];
		char carType = type.charAt(0);
		int days = Integer.parseInt(args[1]);
		int result = c1.calculateRental(carType, days);
		System.out.println("Price after dicont is : " + result);
	}

}
