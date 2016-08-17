# 課題2 プリンタークラスの実装

## 課題2.1 行番号付きの出力

次の3つのコードがあります。

+ example.case2.Main（実装済み）
+ example.case2.lib.Printer（実装済み、修正可）
+ example.case2.lib.LineNoPrinter（未実装）

> 課題1とは異なるパッケージにプログラムを作成するので注意してください。またimportするクラスを間違えないように気をつけてください。

```java
package example.case2;

import example.case2.lib.LineNoPrinter;
import example.case2.lib.Printer;

public class Main {
	public static void main(String[] args) {
		String[] members = { "Kimura", "Nakai", "Inagaki", "Kusanagi", "Katori" };

		Printer printer = new LineNoPrinter(members);
		printer.print();
	}
}
```

> Mainクラスは完成しています。

```java
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
			System.out.println(lines[i]);
		}
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

> Printerクラスも完成しています。ただし修正しても構いません。

```java
package example.case2.lib;

public class LineNoPrinter {
    // TODO
}
```

> LineNoPrinterクラスは未実装です。

次の実行結果になるようにLineNoPrinterクラス、Prinerクラスを実装してください。

```
Kimura
Nakai
Inagaki
Kusanagi
Katori
1:Kimura
2:Nakai
3:Inagaki
4:Kusanagi
5:Katori
```

### 任意課題

HTML形式で出力するHTMLプリンタークラスを実装してください。実行結果は次のようになります。

```html
<html>
<head><title>HTMLPrinter</title></head>
<body>
<ul>
<li>Kimura</li>
<li>Nakai</li>
<li>Inagaki</li>
<li>Kusanagi</li>
<li>Katori</li>
</ul>
</body>
</html>
```
