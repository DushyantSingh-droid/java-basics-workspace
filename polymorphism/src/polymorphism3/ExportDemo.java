package polymorphism3;

public class ExportDemo {

	public static void main(String[] args) {
		ExportProcessor exp = new ExportProcessor ();
		
		FileExporter f1 = new FileExporter();
		FileExporter f2 = new PDFExporter();
		PDFExporter p1 = (PDFExporter)f2;
		FileExporter f3 = new CSVExporter();
		FileExporter f4 = new JSONExporter();

		exp.export(f1, "Default");
		exp.export(f2, "imp.pdf");
		p1.setPageSize();
		exp.export(f3, "list.csv");
		exp.export(f4, "prep.json");
		
	}

}
