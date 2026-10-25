package polymorphism1;

 class Finance {

}
class User extends Finance{
	
}
class Dushyant extends User{
	
}
class Car extends Dushyant{
	
}
public class Driver{

	public static void main(String[] args) {
		User u1 = new Dushyant();
		Dushyant u = (Dushyant)u1;
		Finance f1 = new User();
       // down casting --> child class is refering to parent class obj
	//	Dushyant d1 =(Dushyant) new Finance();
	//	Car c1 = (Car) new Finance();
	//	Car c2 = (Car) new User();
		
	}

}
