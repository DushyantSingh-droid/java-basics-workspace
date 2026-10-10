package com.kodewala.array1;

class ArrayTraversal {
	int numbers;

	ArrayTraversal(int _numbers) {
		super();
		this.numbers = _numbers;
	}
}

public class ArrayBiggestElement {

	public static void main(String[] args) {
		ArrayTraversal t1 = new ArrayTraversal(-5);
		ArrayTraversal t2 = new ArrayTraversal(-6);
		ArrayTraversal t3 = new ArrayTraversal(-2);
		ArrayTraversal t4 = new ArrayTraversal(-5);
		ArrayTraversal t5 = new ArrayTraversal(-9);

		ArrayTraversal[] integers = new ArrayTraversal[5];
		integers[0] = t1;
		integers[1] = t2;
		integers[2] = t3;
		integers[3] = t4;
		integers[4] = t5;
		int largest = integers[0].numbers;
		for (int i = 1; i < integers.length; i++) {
			if (largest < integers[i].numbers) {
				largest = integers[i].numbers;
			}
		}
		System.out.println(largest);
	}

}
