package polymorphism3;

public class ShippingCalculator {
  public void display(ShippingMethod method , double weight) {
	 System.out.println(method.calculateCost(weight));
  }
}
