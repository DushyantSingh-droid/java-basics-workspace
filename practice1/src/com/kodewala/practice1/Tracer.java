package com.kodewala.practice1;

public class Tracer {
	static {
		System.out.println("Static Block");
	 }
	{
		System.out.println("Instance Block");
	}
	public Tracer() {
		System.out.println("Constructor");
	}
}
