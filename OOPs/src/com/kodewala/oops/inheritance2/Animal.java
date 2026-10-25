package com.kodewala.oops.inheritance2;

public class Animal {
	private final String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void sound() {
		System.out.println(getName() + " makes a sound");
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	@Override
	public void sound() {
		System.out.println(getName() + " says Woof");
	}
	public void fetch() {
	    System.out.println(getName() + " fetches the ball");
	}
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	public void sound() {
		System.out.println(getName() + " says Meow");
	}
}
