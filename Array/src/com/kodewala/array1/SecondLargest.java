package com.kodewala.array1;

class ArrayTraversal3 {
	int numbers;

	ArrayTraversal3(int _numbers) {
		super();
		this.numbers = _numbers;
	}
}

public class SecondLargest {

	public static void main(String[] args) {
		ArrayTraversal3 t1 = new ArrayTraversal3(-5);
		ArrayTraversal3 t2 = new ArrayTraversal3(-6);
		ArrayTraversal3 t3 = new ArrayTraversal3(-2);
		ArrayTraversal3 t4 = new ArrayTraversal3(-5);
		ArrayTraversal3 t5 = new ArrayTraversal3(-9);

		ArrayTraversal3[] integers = new ArrayTraversal3[5];
		integers[0] = t1;
		integers[1] = t2;
		integers[2] = t3;
		integers[3] = t4;
		integers[4] = t5;
		int largest = integers[0].numbers;
		int secondLargest = 0;
		boolean foundSecondLargest = false;
		for (int i = 1; i < integers.length; i++) {
			int current = integers[i].numbers;
			if (largest < current) {
				secondLargest = largest;
				largest = current;
				foundSecondLargest = true;
			} else if (largest > current && (!foundSecondLargest || current > secondLargest)) {

				secondLargest = current;
				foundSecondLargest = true;
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);
	}

}
