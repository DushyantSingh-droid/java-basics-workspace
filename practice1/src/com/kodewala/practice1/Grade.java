package com.kodewala.practice1;
import java.util.Scanner;
public class Grade {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String a = sc.nextLine();
		System.out.println("Enter Marks");
	    int marks = sc.nextInt();
		if(marks < 0 && marks >100) {
			System.out.println("Invalid");
		}
		else if (marks >= 90) {
			System.out.println("A");
		}
		else if (marks >= 75) {
			System.out.println("B");
		}
		else if (marks >= 50) {
			System.out.println("C");
		}
		else{
			System.out.println("Fail");
		}

	}

}
