package com.kodewala.practice1;

public class Calculator {
    public static int sum(int a,int b,int c) {
    	return a+b+c;
    }
    public static int max(int a,int b, int c) {
    	int winner =0;
    	if (a >= b && a >= c) {
    		winner = a;
    		return winner;
    	}
    	else if (a < b && b >= c) {
    		winner = b;
    		return winner;
    	}
    	else 
    	{   winner =c;
    		return winner;
    	}	
    }
    public static double average(int a ,int b,int c) {
    	return((long)a+b+c)/3.0d;
    }
	public static void main(String[] args) {
		System.out.println(max(3, 9, 5));
		System.out.println(max(9, 3, 5));
		System.out.println(max(-1, -5, -3));
		System.out.println(max(4, 4, 2));
		System.out.println(max(5, 5, 3));
		System.out.println(average(1, 2, 2));
		System.out.println(average(2000000000, 2000000000, 2000000000));
	}

}
