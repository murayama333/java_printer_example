package example.case2.lib;

public class HTMLPrinter extends Printer {

	public HTMLPrinter(String[] lines) {
		super(lines);
	}

	@Override
	public void print() {
		if (lines == null) {
			throw new IllegalStateException("lines is null.");
		}

		System.out.println("<html>");
		System.out.println("<head><title>HTMLPrinter</title></head>");
		System.out.println("<body>");

		System.out.println("<ul>");
		for (int i = 0; i < lines.length; i++) {
			System.out.println("<li>" + lines[i] + "</li>");
		}
		System.out.println("</ul>");
		System.out.println("</body>");
		System.out.println("</html>");
	}
}
