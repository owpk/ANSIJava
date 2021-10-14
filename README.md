- install to local maven repository:

```
./gradlew publishToMavenLocal
```

- usage:

```
import org.owpk.ansi.AnsiJava;
import org.owpk.ansi.Color;

publis class MyClass {

   publis static void main(String... args) {
      String coloredString = AnsiJava.colorize("Hello world!", Color.BLUE);
      System.out.println(coloredString);
   }

}
```

