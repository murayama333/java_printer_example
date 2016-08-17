# 課題3 プリンタークラスの実装3

## 課題3.1 行番号付きの出力

次の3つのコードがあります。

+ example.case3.Main（実装中）
+ example.case3.lib.Printable（実装済み）
+ example.case3.lib.Printer（実装済み）


```java
package example.case3;

import example.case3.lib.Printable;
import example.case3.lib.Printer;

public class Main {
	public static void main(String[] args) {
		String[] members = { "Kimura", "Nakai", "Inagaki", "Kusanagi", "Katori" };

		// TODO
		// Printable printable = new Printer(members)???;
		// printable.print();
	}
}
```

> Mainクラスは作成途中です。Printable型の変数でPrinterインスタンスを扱うことができず困っています。

```java
package example.case3.lib;

import java.util.List;

public interface Printable {

	void print();

	void print(int count);

	void setData(List<String> rows);
}
```

> Printableインタフェースは完成しています。修正してはいけません。

```java
package example.case3.lib;

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
```

> Printerクラスは完成しています。修正してはいけません。

PrinterクラスはPrintableインタフェースと互換性がないためMainクラスの実装に困っています。既存のPrintableインタフェース、Printerクラスは修正せずに新たなクラスを作成して、以下の実行結果となるようにしてください。

```
Kimura
Nakai
Inagaki
Kusanagi
Katori
```

### 課題の考察

+ 今回の問題を解決するデザインパターンは何と呼ぶのでしょうか。
