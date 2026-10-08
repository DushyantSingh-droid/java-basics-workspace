package com.kodewala.control.flow2;

public class HotelBooking {
	public int calculateBill(String roomType, int nights, int guests) {
		int surcharge = 0;
		int roomCost = 0;
		int price = 0;
		if (nights <= 0 || guests <= 0) {
			return -1;
		}
		if (guests > 4) {
			return -2;
		}
		switch (roomType) {
		case "STANDARD":
			price = 2000;
			roomCost = nights * price;
			System.out.println("RoomCost : " + roomCost);
			break;
		case "DELUXE":
			price = 3500;
			roomCost = nights * price;
			System.out.println("RoomCost : " + roomCost);
			break;
		case "SUITE":
			price = 5000;
			roomCost = nights * price;
			System.out.println("RoomCost : " + roomCost);
			break;
		default:
			return -3;

		}
		if (guests <= 2) {
			surcharge = 0;
		} else if (guests == 3) {
			surcharge = 500 * nights;
		} else {
			surcharge = 1000 * nights;
		}
		int totalBill = surcharge + roomCost;
		if (totalBill >= 20000) {
			int discount = totalBill * 10 / 100;

			if (discount > 2000) {
				discount = 2000;
			}
			totalBill = totalBill - discount;
		}
		System.out.println("Your Total Bill Is : " + totalBill);
		return totalBill;

	}

	public static void main(String args[]) {
		HotelBooking h1 = new HotelBooking();
		String room = args[0];
		int nights = Integer.parseInt(args[1]);
		int guests = Integer.parseInt(args[2]);
		h1.calculateBill(room, nights, guests);

	}
}
