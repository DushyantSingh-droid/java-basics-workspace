package polymorphism3;

public class ReportMain {
	public static void main (String args[]) {
		ReportRunner reportRunner = new ReportRunner();
		
		ReportDocument reportDocument = new SalesReport();
		ReportDocument reportDocument1 = new ComplianceReport();
		ReportDocument reportDocument2 = new StockReport();
		ReportDocument reportDocument3 = new ReportDocument();
		reportRunner.runReport(reportDocument);
		reportRunner.runReport(reportDocument1);
		reportRunner.runReport(reportDocument2);
		reportRunner.runReport(reportDocument3);
	}
}
