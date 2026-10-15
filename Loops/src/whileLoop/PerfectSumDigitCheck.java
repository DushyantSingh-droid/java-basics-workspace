package whileLoop;

import java.util.Scanner;

public class PerfectSumDigitCheck {

	public static void main(String[] args) {
		System.out.println("Enter a positive integer :");
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		sc.nextLine();
		int temp = number;
		int sumDigits = 0;
		while (temp > 0) {

			int digit = temp % 10;
			sumDigits = sumDigits + digit;
			temp = temp / 10;
		}
		int sumDivisors = 0;
		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				sumDivisors = sumDivisors + i;
			}

		}
		if (sumDivisors == number) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("NOT A PERFECT NO.");
		}

		System.out.println(" the sum : " + sumDigits);
		System.out.println("the sum of it divisor is : " + sumDivisors);

	}

}
