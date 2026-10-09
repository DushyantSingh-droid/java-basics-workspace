package com.kodewala.strings2;
import java.util.Scanner;
public class StringCharacter {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input : ");
		String input = sc.nextLine();
		System.out.println("Enter index : ");
		int index = sc.nextInt();
		char character = input.charAt(index);
		System.out.println(character);
		sc.close();
	}
}
