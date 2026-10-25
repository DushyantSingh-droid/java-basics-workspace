package polymorphism3;

public class ShippingMethod {
	public double calculateCost(double weight) {
		return weight * 10;
	}
}
class StandardShipping extends ShippingMethod{
	@Override
	public double calculateCost(double weight) {
		return weight * 20;
	}
}
class ExpressShipping extends ShippingMethod{
	@Override
	public double calculateCost(double weight) {
		return weight * 35;
	}
}
class InternationalShipping extends ShippingMethod{
	@Override
	public double calculateCost(double weight) {
		return weight * 60;
	}
}