package com.kodewala.oops.inheritance2;

public class AnimalMain {
	public static void main (String args[]) {
		Animal a = new Animal("Generic");
		Animal d = new Dog("Bruno");
        Animal c = new Cat ("Kitty");
		a.sound();
		d.sound();
		c.sound();
		
	}
}
