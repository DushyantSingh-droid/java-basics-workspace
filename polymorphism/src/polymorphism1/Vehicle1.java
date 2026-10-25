package polymorphism1;

public class Vehicle1 {
	public void start() {
		System.out.println("Vehicle is starting...");
	}
}
class Car1 extends Vehicle1 {
	public void drive () {
		System.out.println("Car is Driving");
	}
}