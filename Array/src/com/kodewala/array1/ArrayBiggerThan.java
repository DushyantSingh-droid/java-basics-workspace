package com.kodewala.array1;

import java.util.Scanner;

class ArrayTraversal2 {
	int numbers;

	ArrayTraversal2(int _numbers) {
		this.numbers = _numbers;
	}
}

public class ArrayBiggerThan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		ArrayTraversal2 a1 = new ArrayTraversal2(sc.nextInt());
		ArrayTraversal2 a2 = new ArrayTraversal2(sc.nextInt());
		ArrayTraversal2 a3 = new ArrayTraversal2(sc.nextInt());
		ArrayTraversal2 a4 = new ArrayTraversal2(sc.nextInt());
		ArrayTraversal2 a5 = new ArrayTraversal2(sc.nextInt());

		ArrayTraversal2[] integers = new ArrayTraversal2[5];
		integers[0] = a1;
		integers[1] = a2;
		integers[2] = a3;
		integers[3] = a4;
		integers[4] = a5;

		int count = 0;

		for (int i = 0; i < integers.length; i++) {
			if (integers[i].numbers > 20) {
				count++;
			}
		}
		System.out.println("The number of element greater than 20 is : " + count);
		sc.close();
	}

}
