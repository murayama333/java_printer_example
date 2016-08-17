# 課題1 プリンタークラスの実装1

## 課題1.1 プリンターの実装

次の2つのコードがあります。

+ example.case1.Main （実装済み）
+ example.case1.lib.Printer（未実装）

```java
package example.case1;

import example.case1.lib.Printer;

public class Main {
	public static void main(String[] args) {
		String[] members = { "Kimura", "Nakai", "Inagaki", "Kusanagi", "Katori" };

		Printer printer = new Printer(members);
		printer.print();
	}
}
```

> Mainクラスは完成しています。


```java
package example.case1.lib;

public class Printer {
    // TODO
}
```

> Printerクラスはパッケージがlibなので注意してください。


次の実行結果になるようにPrinterクラスを実装してください。

```
Kimura
Nakai
Inagaki
Kusanagi
Katori
```

### 課題1.2 印刷枚数の指定

Main.javaを修正しました。

```java
package example.case1;

import example.case1.lib.Printer;

public class Main {
	public static void main(String[] args) {
		String[] members = { "Kimura", "Nakai", "Inagaki", "Kusanagi", "Katori" };

		Printer printer = new Printer(members);
		printer.print();
		printer.print(2);
	}
}
```

> printer.print(2)を追記しました。

次の実行結果になるようにPrinterクラスを修正してください。

```
Kimura
Nakai
Inagaki
Kusanagi
Katori
Kimura
Nakai
Inagaki
Kusanagi
Katori
Kimura
Nakai
Inagaki
Kusanagi
Katori
```


### 課題1.3 印刷データの変更

Main.javaを修正しました。

```java
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
```

次の実行結果になるようにPrinterクラスを修正してください。

```
Kimura
Nakai
Inagaki
Kusanagi
Katori
Kimura
Nakai
Inagaki
Kusanagi
Katori
Kimura
Nakai
Inagaki
Kusanagi
Katori
Uchimura
Hagino
Nishikori
Exception in thread "main" java.lang.IllegalStateException: lines is null.
	at example.case1.lib.Printer.print(Printer.java:15)
	at example.case1.Main.main(Main.java:19)
```

#### 課題の考察

+ IllegalStateExceptionとは何でしょう。どのメソッドでスローすべきでしょうか。
+ 実行するタイミングによっては以下のような結果が出力されることもあります。なぜでしょうか。

```
Exception in thread "main" java.lang.IllegalStateException: lines is null.
	at example.case1.lib.Printer.print(Printer.java:15)
	at example.case1.Main.main(Main.java:19)
Kimura
Nakai
Inagaki
Kusanagi
Katori
Kimura
Nakai
Inagaki
Kusanagi
Katori
Kimura
Nakai
Inagaki
Kusanagi
Katori
Uchimura
Hagino
Nishikori
```


### 任意課題

時間があれば実装してみてください。

+ printメソッドの引数に -1 が指定された場合、プログラムはどう振る舞うべきでしょうか。
+ 10行出力したら改ページ（"PAGE BREAK"と出力）するにはどう実装すべきでしょうか。
