package polymorphism1;

public class AnimalMain {
public static void main(String [] args) {
		
		Animal a = new Dog();
		((Dog)a).fetch();
	//	Dog dog = (Dog)a;
		a.sound();
	//	dog.fetch();
		Animal a1 = new Cat();
		//Cat cat = (Cat)a1;
		a1.sound();
		((Cat)a1).purr();
		//cat.purr();
		Animal y = new Cat();
		if (y instanceof Dog) {
		    System.out.println("dog");
		} else {
		    System.out.println("not a dog");
		}
		
	}
}
