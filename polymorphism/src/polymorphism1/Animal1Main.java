package polymorphism1;

public class Animal1Main {

	public static void main(String[] args) {
		Animal1 a = new Dog1();
		if (a instanceof Dog1) {
			((Dog1)a).bark();
		}
		else {
			System.out.println("This animal is not a dog");
		}
		Animal1 b = new Cat1();
		if (b instanceof Dog1) {
			((Dog1)b).bark();
		}
		else {
			System.out.println("This animal is not a dog");
		}
	}

}
