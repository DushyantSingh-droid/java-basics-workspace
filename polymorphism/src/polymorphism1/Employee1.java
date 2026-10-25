package polymorphism1;

public class Employee1 {
	public void work() {
		System.out.println("Employee is working");
	}
}
class Developer extends Employee1{
    @Override
    public void work(){
    	System.out.println("Developer is working");
    }
    public void deBug () {
    	System.out.println("Developer is debugging code");
    }
}
class Tester extends Developer{
	@Override 
	public void work() {
		System.out.println("Tester is testing the codes build");
	}
}
