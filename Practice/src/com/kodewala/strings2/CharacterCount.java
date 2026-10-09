package com.kodewala.strings2;
import java.util.Scanner;
public class CharacterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input : ");
		String input = sc.nextLine();
		System.out.println("Enter character : ");
		String inputChar = sc.next();
		char target = inputChar.charAt(0);
		int count = 0;
		
		for(int i = 0; i < input.length();i++) {
			char ch = input.charAt(i);
			if (ch == target) {
				count ++;
			}
		}
		System.out.println("the character was found : " + count + " times");
		sc.close();
	}

}
