package polymorphism1;

public class Animal1 {
	public void eat() {
		System.out.println("Animal eats");
	}
}
class Dog1 extends Animal1 {
	public void bark() {
		System.out.println("Dog Barks");
	}
}
class Cat1 extends Animal1 {
	public void meow() {
		System.out.println("Cat Meows");
	}
}