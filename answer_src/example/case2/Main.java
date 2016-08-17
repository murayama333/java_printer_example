package example.case2;

import example.case2.lib.HTMLPrinter;
import example.case2.lib.LineNoPrinter;
import example.case2.lib.Printer;

public class Main {
	public static void main(String[] args) {
		String[] members = { "Kimura", "Nakai", "Inagaki", "Kusanagi", "Katori" };

		Printer printer1 = new Printer(members);
		printer1.print();

		Printer printer2 = new LineNoPrinter(members);
		printer2.print();

		Printer printer3 = new HTMLPrinter(members);
		printer3.print();
	}
}
