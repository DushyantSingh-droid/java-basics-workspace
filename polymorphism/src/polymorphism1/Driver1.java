package polymorphism1;

class Employee{
	static void fired() {
		System.out.println("FIRED");
	}
	public void markIn(){
		System.out.println("Employee markIn");
	}
}
class HrManager extends Employee{
	@Override
	public void markIn(){
		System.out.println("Employee markIn");
	}
	
}
public class Driver1 {

	public static void main(String[] args) {
		Employee e2 =  new HrManager();

		Employee.fired();
	}

}
