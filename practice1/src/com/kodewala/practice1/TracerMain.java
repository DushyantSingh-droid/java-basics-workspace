package com.kodewala.practice1;

public class TracerMain {

	public static void main(String[] args) {
		
		        System.out.println("main start");
		        new Tracer();
		        System.out.println("between");
		        new Tracer();
		        System.out.println("main end");
		    }
}
