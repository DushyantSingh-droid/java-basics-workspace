package polymorphism1;

class Animal {
	public void sound() {
		System.out.println("Makes a sound");
	}
}
class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("Wooof");
	}
	void fetch() {
		System.out.println("fetching");
	}
}
class Cat extends Animal{
	@Override
	public void sound() {
		System.out.println("Meow");
	}
	void purr() {
		System.out.println("purring");
	}
}

	