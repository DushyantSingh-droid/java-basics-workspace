package com.kodewala.array1;

class ArrayTraversal1 {
	int integers;

	ArrayTraversal1(int _integers) {
		this.integers = _integers;
	}
}

public class ArraySmallestElement {

	public static void main(String[] args) {
		ArrayTraversal1 l1 = new ArrayTraversal1(10);
		ArrayTraversal1 l2 = new ArrayTraversal1(25);
		ArrayTraversal1 l3 = new ArrayTraversal1(7);
		ArrayTraversal1 l4 = new ArrayTraversal1(40);
		ArrayTraversal1 l5 = new ArrayTraversal1(15);

		ArrayTraversal1[] numbers = new ArrayTraversal1[5];
		numbers[0] = l1;
		numbers[1] = l2;
		numbers[2] = l3;
		numbers[3] = l4;
		numbers[4] = l5;

		int smallest = numbers[0].integers;
		for (int i = 1; i < numbers.length; i++) {
			if (smallest > numbers[i].integers) {
				smallest = numbers[i].integers;
			}
		}
		System.out.println(smallest);
	}

}
