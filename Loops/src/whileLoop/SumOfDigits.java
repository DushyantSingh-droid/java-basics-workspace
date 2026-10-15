package whileLoop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = sc.nextInt();
		
		int temp = number;
		int sumDigits = 0;

		while (temp != 0) {
			int digit = temp % 10;
			if (digit < 0) {
				digit = -1 * digit;
			}
			sumDigits = sumDigits + digit;
			temp = temp / 10;
		}
		System.out.println("Sum is : " + sumDigits);
	}

}
