package example.case1;

import example.case1.lib.Printer;

public class Main {
	public static void main(String[] args) {
		String[] members = { "Kimura", "Nakai", "Inagaki", "Kusanagi", "Katori" };

		Printer printer = new Printer(members);
		printer.print();
		printer.print(2);

		String[] athletes = { "Uchimura", "Hagino", "Nishikori" };

		printer.setLines(athletes);
		printer.print();

		printer.setLines(null);
		printer.print();
	}
}
