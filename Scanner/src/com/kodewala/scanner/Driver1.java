package com.kodewala.scanner;
import java.util.Scanner;
public class Driver1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // reading input from keyboard 
		int price = 0;
		System.out.println("Please enter price : ");
		
		//  Checking if user gave the Integer Input or not
		if (sc.hasNextInt())
		{
			price = sc.nextInt();
		}
		else
		{
			System.out.println("Please enter valid input : ");
		}
		System.out.println("price : " + price);
		sc.close();  // closing the Scanner class

	}

}
