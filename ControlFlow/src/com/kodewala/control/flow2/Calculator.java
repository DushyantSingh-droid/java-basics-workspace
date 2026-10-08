package com.kodewala.control.flow2;

public class Calculator {
	public int calculate (int a,int b, char operator) {
		switch(operator) {
		case '+' : 
			int addition = a + b;
			System.out.println("Addition of a and b is : " + addition);
			return addition;
		case '-' : 
			int substraction = a - b;
			System.out.println("Substraction of a and b is : " + substraction);	
			return substraction;
		case '*' : 
			int multiplication = a * b;
			System.out.println("Multiplication of a and b is : " + multiplication);
			return multiplication;
			
		case '/' : 
			
			if(b == 0) {
				System.out.println("B cannot be zero");
				return -1;
			}
			int division = a / b;
			System.out.println("division of a and b is : " + division);	
			return division;
		default : 
			System.out.println("Input valid input ");
			return -1;
		}
	}
	
	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		char operator = args[2].charAt(0);
		calculator.calculate(a, b, operator);
	}	
}
