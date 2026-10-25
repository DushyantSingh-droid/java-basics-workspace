package polymorphism3;

public class ShippingDemo {

	public static void main(String[] args) {
		ShippingCalculator c1 = new ShippingCalculator();
		
		ShippingMethod s = new StandardShipping();
		ShippingMethod s1 = new ExpressShipping();
		ShippingMethod s2 = new InternationalShipping();
		ShippingMethod s3 = new ShippingMethod();
		c1.display(s, 2.0);
		c1.display(s1, 2.0);
		c1.display(s2, 2.0);
		c1.display(s3, 2.0);
	}

}
