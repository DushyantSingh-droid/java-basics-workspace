package polymorphism1;

public class Driver2 {
	public static void main(String [] args) {
		Employee1 e1 = new Developer();
		e1.work();
	   // e1.deBug();	--> not in the Employee1 class at compilation time it checks in the variable type class
	}
}
