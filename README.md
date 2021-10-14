- install to local maven repository:

```
./gradlew publishToMavenLocal
```

- add dependency:

<details>
    <summary>maven</summary>
    <p>
        ```xml
        <dependency>
            <groupId>org.owpk</groupId>
            <artifactId>ansi</artifactId>
            <version>1.0</version>
        </dependency>
        ```
    </p>
</details>


<details>
    <summary>gradle</summary>
    <p>
        ```groovy
        repositories {
           mavenLocal()
        }

        dependencies {
           implementation 'org.owpk:ansi:1.0'
        }
        ```
    </p>
</details>

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

