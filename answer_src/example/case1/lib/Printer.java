package example.case1.lib;

import java.util.Arrays;

public class Printer {

	protected String[] lines;

	public Printer(String[] lines) {
		this.lines = lines;
	}

	public void print() {
		if (lines == null) {
			throw new IllegalStateException("lines is null.");
		}
		Arrays.stream(lines).forEach(System.out::println);
	}

	public void print(int count) {
		for (int i = 0; i < count; i++) {
			print();
		}
	}

	public void setLines(String[] lines) {
		this.lines = lines;
	}
}
