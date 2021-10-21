package ansi;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println(ANSIJava.colorize("asddsa", Color.BLUE, "[ %S ]"));

        List<String> list = new ArrayList<>();
        list.add("Abc");
        list.add("Abc1");
        list.add("Abc2");
        list.add("Abc3");
        list.add("Abc4");
        System.out.println(ANSIJava.colorize(list, Color.BLUE, "[ %S ]"));
        System.out.println(ANSIJava.colorize((List<String>) null, null, null));
        System.out.println(ANSIJava.colorize((String) null, null, null));
    }
}
