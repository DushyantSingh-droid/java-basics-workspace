package com.kodewala.control.flow2;

import java.util.Scanner;

public class AirlineBooking {
	public int calculateFare(char classType, int age, int baggage, int passengers) {
//-----------Initializing values ---------------
		int pricePerPassenger = 0;
		int ageDiscount = 0;
		int baggageCharge = 0;
		int finalFare = 0;
		int groupDiscount = 0;
//--------Checking for invalid conditions ----------		
		if (age < 0) {
			return -1;
		} else if (baggage < 0) {
			return -2;
		} else if (passengers <= 0) {
			return -3;
		}
//-------Switch case -----------
		switch (classType) {
		case 'E':
			pricePerPassenger = 5000;
			break;
		case 'B':
			pricePerPassenger = 12000;
			break;
		case 'F':
			pricePerPassenger = 20000;
			break;
		default:
			return -4;
		}
		int baseFare = passengers * pricePerPassenger;

		if (age < 5) {
			ageDiscount = baseFare * 50 / 100;
		} else if (age <= 17) {
			ageDiscount = baseFare * 25 / 100;
		} else if (age <= 59) {
			ageDiscount = 0;
		} else if (age > 59) {
			ageDiscount = baseFare * 20 / 100;
			if (ageDiscount > 5000) {
				ageDiscount = 5000;
			}
		}
		if (baggage <= 20) {
			baggageCharge = 0;
		} else if (baggage <= 30) {
			baggageCharge = 1000;
		} else if (baggage <= 40) {
			baggageCharge = 2000;
		} else {
			baggageCharge = 3000;
		}
		if (passengers >= 4) {
			groupDiscount = 2000;
		}
		finalFare = baseFare - ageDiscount + baggageCharge - groupDiscount;
		if (finalFare < 0) {
			finalFare = 0;
		}
		return finalFare;
	}
//---------Printing final output and taking inputs --------------
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		AirlineBooking a1 = new AirlineBooking();
		System.out.println("Enter the type :");
		String type = sc.next();
		char classType = type.charAt(0);
		System.out.println("Enter the age :");
		int age = sc.nextInt();
		System.out.println("Enter the baggage :");
		int baggage = sc.nextInt();
		System.out.println("Enter the tpe :");
		int passengers = sc.nextInt();
		int result = a1.calculateFare(classType, age, baggage, passengers);
		System.out.println("Final Bill : " + result);
		sc.close();
	}
}
