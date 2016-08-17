package example.case3.lib;

import java.util.List;

public class PrinterAdapter implements Printable {

	private Printer printer;

	public PrinterAdapter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void print() {
		printer.print();
	}

	@Override
	public void print(int count) {
		printer.print(count);
	}

	@Override
	public void setData(List<String> rows) {
		printer.setLines(rows.toArray(new String[0]));
	}

}
