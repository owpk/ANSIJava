- install to local maven repository:

```
./gradlew publishToMavenLocal
```

- add dependency:

> maven
```xml
<repositories>
	<repository>
		 <id>jitpack.io</id>
		 <url>https://jitpack.io</url>
	</repository>
</repositories>

<dependency>
    <groupId>org.owpk</groupId>
    <artifactId>ansi</artifactId>
    <version>1.9</version>
</dependency>
```

> gradle

```groovy
repositories {
   maven { url "https://jitpack.io" }
}

dependencies {
   implementation 'com.github.owpk:ANSIJava:1.9'
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

