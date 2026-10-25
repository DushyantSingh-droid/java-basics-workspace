package com.kodewala.oops.inheritance2;

public class Shape {
	private final String name;

	public Shape(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public double area() {
		return 0;
	}
}

class Circle extends Shape {
	private final double radius;

	public Circle(double radius) {
		super("Circle");
		if (radius <= 0) {
			throw new IllegalArgumentException("Invalid Input");
		}

		this.radius = radius;
	}

	@Override
	public double area() {
		return 3.14 * radius * radius;
	}

}

class Rectangle extends Shape {
	private final double length;
	private final double width;

	public Rectangle(double length, double width) {
		super("Rectangle");
		if (length <= 0 || width <= 0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}
}