package com.kodewala.practice;

public class StudentCounter {
	String name;
	String rollNo;
	public static int count = 0;

	StudentCounter(String _name, String _rollNo) {
		System.out.println("StudentCounter--->StudentCounter(String _name,String _rollNo)");
		this.name = _name;
		this.rollNo = _rollNo;
	}

	StudentCounter(String _name) {
		System.out.println("StudentCounter--> StudentCounter(String _name)");
		this.name = _name;
	}

	StudentCounter() {
		System.out.println("StudentCounter--> StudentCounter()");
	}

	{
		count++;
	}

	public static void main(String args[]) {
		StudentCounter s1 = new StudentCounter("Dushyant", "CS393939");
		StudentCounter s2 = new StudentCounter("Dushyant");
		StudentCounter s3 = new StudentCounter();
		System.out.println("THE number of Count is : " + count);
	}
}
