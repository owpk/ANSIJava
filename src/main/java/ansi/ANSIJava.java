package ansi;

import java.util.List;
import java.util.stream.Collectors;

public final class ANSIJava {

    private ANSIJava() {}

    private static String format(String input, String format) {
        if (checkForEmptyString(input) && checkForEmptyString(format)) {
            return String.format(format, input);
        }
        return "";
    }

    public static String colorize(List<String> list, Color color, String delimiter, String format) {
        if (checkForEmptyList(list))
            return list.stream().map(x -> colorize(format(x, format), color)).collect(Collectors.joining(delimiter));
        else return "";
    }

    public static String colorize(List<String> list, Color color) {
        return colorize(list, color, ", ", "%s");
    }

    public static String colorize(List<String> list, int colorIndex) {
        return colorize(list, colorIndex, ", ", "%s");
    }

    public static String colorize(List<String> list, int colorIndex, String delimiter, String format) {
        checkColorIdx(colorIndex);
        if (checkForEmptyList(list))
            return list.stream().map(x -> colorize(format(x, format), colorIndex)).collect(Collectors.joining(delimiter));
        else return "";
    }

    public static String colorize(List<String> list, Color color, String format) {
        return colorize(list, color, ", ", format);
    }

    public static String colorize(String input, Color color, String format) {
        if (checkForEmptyString(input)) {
            return colorize(format(input, format), color);
        }
        else return "";
    }

    private static boolean checkForEmptyString(String input) {
        return input != null && !input.equals("");
    }

    private static boolean checkForEmptyList(List<String> list) {
        return list != null && list.size() > 0;
    }

    public static String colorize(String input, Color color) {
        if (color == null) {
            color = Color.BLUE;
        }
        return colorize(input, color.getInd());
    }

    public static String colorize(String input, int colorIndex) {
        checkColorIdx(colorIndex);
        return String.format("\033[38;5;%dm%s\033[0m", colorIndex, input);
    }

    private static void checkColorIdx(int idx) {
        if (idx < 0 || idx > 255)
            throw new RuntimeException("Wrong color index: " + idx);
    }
}
