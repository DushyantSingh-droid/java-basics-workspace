package com.kodewala.control.flow2;

public class FoodOrder {
	public int calculatePrice(String type, int quantity) {
		if (quantity <= 0) {
			return -1;
		}
		int price = 0;
		int total = 0;
		switch (type) {

		case "Burger":
			price = 150;
			// total = price * quantity;
			// System.out.println("Total is : " + total); `
			break;
		case "Pizza":
			price = 300;
			// total = price * quantity;
			// System.out.println("Total is : " + total);
			break;
		case "Sandwich":
			price = 100;
			// total = price * quantity;
			// System.out.println("Total is : " + total);
			break;
		case "Fries":
			price = 80;
			// total = price * quantity;
			// System.out.println("Total is : " + total);
			break;
		default:
			return -1;
		}
		total = price * quantity;
		System.out.println("Total is : " + total);
		return total;
	}

	public static void main(String args[]) {
		FoodOrder foodOrder = new FoodOrder();
		String type = args[0];
		int quantity = Integer.parseInt(args[1]);
		foodOrder.calculatePrice(type, quantity);
	}
}
