package colors;
public class Color {
    //colors deffinition.
    public static final String COLOR_RESET = "\u001B[0m";
    public static final String BLACK_COLOR = "\u001B[30m";
    public static final String RED_COLOR = "\u001B[31m";
    public static final String GREEN_COLOR = "\u001B[32m";
    public static final String YELLOW_COLOR = "\u001B[33m";
    public static final String BLUE_COLOR = "\u001B[34m";
    public static final String PURPLE_COLOR = "\u001B[35m";
    public static final String WHITE_COLOR = "\u001B[37m";

    public static void main(String[] args) {
        writeColoredText(BLACK_COLOR, "That's not really funny, but to be honnest, nothing really works...");
    }

    public static void writeColoredText(String color, String text) {
        System.out.println(color + text + COLOR_RESET);
    }
}
