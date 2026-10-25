package polymorphism3;

public class FileExporter {
	public void exportFileName(String fileName) {
		System.out.println("Exporting file using default format: report");
	}
}
class PDFExporter extends FileExporter{
	@Override
	public void exportFileName(String fileName) {
		System.out.println("Exporting report as PDF : " + fileName);
	}
	public void setPageSize(){
		System.out.println("page size set");
	}
}
class CSVExporter extends FileExporter{
	@Override
	public void exportFileName(String fileName) {
		System.out.println("Exporting report as CSV : " + fileName);
	}
}
class JSONExporter extends FileExporter{
	@Override
	public void exportFileName(String fileName) {
		System.out.println("Exporting report as JSON : " + fileName);
	}
}