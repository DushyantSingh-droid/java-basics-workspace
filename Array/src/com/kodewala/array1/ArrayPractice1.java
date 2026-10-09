package com.kodewala.array1;

class ArrayPractice {
	int numbers;

	ArrayPractice(int _numbers) {
		this.numbers = _numbers;
	}
}

public class ArrayPractice1 {

	public static void main(String[] args) {
		ArrayPractice a1 = new ArrayPractice(10);
		ArrayPractice a2 = new ArrayPractice(25);
		ArrayPractice a3 = new ArrayPractice(7);
		ArrayPractice a4 = new ArrayPractice(40);
		ArrayPractice a5 = new ArrayPractice(15);

		ArrayPractice[] integers = new ArrayPractice[5];
		integers[0] = a1;
		integers[1] = a2;
		integers[2] = a3;
		integers[3] = a4;
		integers[4] = a5;

		for (int i = 0; i < integers.length; i++) {
			System.out.println(integers[i].numbers);
		}
	}

}
