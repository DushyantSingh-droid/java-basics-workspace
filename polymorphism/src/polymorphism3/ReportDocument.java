package polymorphism3;

public class ReportDocument {
	public void generateReport() {
		System.out.println("Generating general report");
	}
}
class SalesReport extends ReportDocument{
	@Override
	public void generateReport() {
		System.out.println("Generating sales report");
	}
}
class StockReport extends ReportDocument{
	@Override
	public void generateReport() {
		System.out.println("Generating stock report");
	}
}
class ComplianceReport extends ReportDocument{
	@Override
	public void generateReport() {
		System.out.println("Generating compliance report");
	}
}