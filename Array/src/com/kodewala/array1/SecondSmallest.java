package com.kodewala.array1;

class ArrayTraversal4 {
	int numbers;

	ArrayTraversal4(int _numbers) {
		super();
		this.numbers = _numbers;
	}
}

public class SecondSmallest {

	public static void main(String[] args) {
		ArrayTraversal4 t1 = new ArrayTraversal4(-5);
		ArrayTraversal4 t2 = new ArrayTraversal4(-6);
		ArrayTraversal4 t3 = new ArrayTraversal4(-2);
		ArrayTraversal4 t4 = new ArrayTraversal4(-5);
		ArrayTraversal4 t5 = new ArrayTraversal4(-9);

		ArrayTraversal4[] integers = new ArrayTraversal4[5];
		integers[0] = t1;
		integers[1] = t2;
		integers[2] = t3;
		integers[3] = t4;
		integers[4] = t5;
		int smallest = integers[0].numbers;
		int secondSmallest = 0;
		boolean foundSecondSmallest = false;
		for (int i = 1; i < integers.length; i++) {
			int current = integers[i].numbers;
			if (smallest > current) {
				secondSmallest = smallest;
				smallest = current;
				foundSecondSmallest = true;
			} else if (smallest < current && (!foundSecondSmallest || current < secondSmallest)) {

				secondSmallest = current;
				foundSecondSmallest = true;
			}
		}
		System.out.println(smallest);
		System.out.println(secondSmallest);
	}

}
