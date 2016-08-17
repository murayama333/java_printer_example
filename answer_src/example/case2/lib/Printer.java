package example.case2.lib;

public class Printer {

	protected String[] lines;

	public Printer(String[] lines) {
		if (lines == null) {
			throw new IllegalArgumentException("lines is null.");
		}
		this.lines = lines;
	}

	public void print() {
		if (lines == null) {
			throw new IllegalStateException("lines is null.");
		}
//		Arrays.stream(lines).forEach(System.out::println);
		for (int i = 0; i < lines.length; i++) {
			printLine(lines[i], i);
		}
	}

	protected void printLine(String line, int index) {
		System.out.println(line);
	}

	public void print(int count) {
		if (count <= 0) {
			throw new IllegalArgumentException("count is invalid. " + count);
		}

		for (int i = 0; i < count; i++) {
			print();
		}
	}

	public void setLines(String[] lines) {
		if (lines == null) {
			throw new IllegalArgumentException("lines is null.");
		}
		this.lines = lines;
	}
}
