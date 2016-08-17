package example.case3;

import example.case3.lib.Printable;
import example.case3.lib.Printer;
import example.case3.lib.PrinterAdapter;

public class Main {
	public static void main(String[] args) {
		String[] members = { "Kimura", "Nakai", "Inagaki", "Kusanagi", "Katori" };

		Printable printable = new PrinterAdapter(new Printer(members));
		printable.print();
	}
}
