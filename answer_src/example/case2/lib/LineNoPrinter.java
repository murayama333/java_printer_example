package example.case2.lib;

public class LineNoPrinter extends Printer {

	public LineNoPrinter(String[] lines) {
		super(lines);
	}

	@Override
	protected void printLine(String line, int index) {
		System.out.println(index + 1 + ":" + line);
	}
}
