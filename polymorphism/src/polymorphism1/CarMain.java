package polymorphism1;

public class CarMain {
	public static void main(String [] args) {
		Vehicle1 v1 = new Car1();
		Car1 c1 = (Car1) v1;
		c1.drive();
	}
}
