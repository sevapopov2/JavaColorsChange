package colors;
public interface TextColorChange {
    //colors deffinition.
    String COLOR_RESET = "\u001B[0m";
    String BLACK_COLOR = "\u001B[30m";
    String RED_COLOR = "\u001B[31m";
    String GREEN_COLOR = "\u001B[32m";
    String YELLOW_COLOR = "\u001B[33m";
    String BLUE_COLOR = "\u001B[34m";
    String PURPLE_COLOR = "\u001B[35m";
    String WHITE_COLOR = "\u001B[37m";

    public void writeColoredText(String color, String text);
}
