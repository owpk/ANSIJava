- install to local maven repository:

```
./gradlew publishToMavenLocal
```

- add dependency:

> maven
```xml
<dependency>
    <groupId>org.owpk</groupId>
    <artifactId>ansi</artifactId>
    <version>1.0</version>
</dependency>
```

> gradle

```groovy
repositories {
   mavenLocal()
}

dependencies {
   implementation 'org.owpk:ansi:1.0'
}
```

- usage:

```java
import org.owpk.ansi.ANSIJava;
import org.owpk.ansi.Color;

publis class MyClass {

   publis static void main(String... args) {
      String coloredString = ANSIJava.colorize("Hello world!", Color.BLUE);
      System.out.println(coloredString);
   }

}
```

