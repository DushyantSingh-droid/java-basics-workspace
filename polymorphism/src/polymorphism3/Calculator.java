package polymorphism3;

public class Calculator {
  public int add(int a ,int b) {
	  return a+b;
  }
  public int add(int a,int b,int c) {
	  return a+b+c;
  }
  public double add( double a,double b) {
	  return a + b;
  }
  int multiply(int a, int b,int c) {
	    return a * b * c;
	}
  double multiply (double a,double b) {
	  return a* b;
  }
  void display (int a,String b) {
	  System.out.println(a +" "+b);
	 
  }
  void display (String a,int b) {
	  System.out.println(a +" "+b);

  }
  public static void main (String [] args) {
	  Calculator c = new Calculator();
	  System.out.println(c.add(7.5, 8.0));
	  System.out.println(c.add(10, 20));
	  System.out.println(c.add(10, 20, 30));
	  System.out.println(c.multiply(10, 20, 30));
	  System.out.println(c.multiply(2.5, 4.0));
	  c.display(10,"Jatin");
	  c.display("Jatin",10);
  }
}
