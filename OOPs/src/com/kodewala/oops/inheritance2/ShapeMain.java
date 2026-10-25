package com.kodewala.oops.inheritance2;

public class ShapeMain {

	public static void main(String[] args) {
		Shape s1 = new Circle(2);
		Shape s2 = new Rectangle(3,4);
		System.out.println(s1.getName()+" "+ s1.area());
		System.out.println(s2.getName()+" "+ s2.area());
		Shape[] shapes = { new Circle(2), new Rectangle(3, 4), new Circle(1) };

		double total = 0;
		for (int i = 0; i < shapes.length; i++) {
		    System.out.println(shapes[i].getName() + " " + shapes[i].area());
		    total = total + shapes[i].area();
		}
		System.out.println("Total: " + total);
	}

}
