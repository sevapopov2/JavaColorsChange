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
        //This is the test function, will be rewritten soon.
        System.out.println( RED_COLOR +"I am a red boy! Look!" + COLOR_RESET);
        System.out.println(BLACK_COLOR + "And this is a black color!" + COLOR_RESET);
    }

    public void changeColor(String color, String text) {
        System.out.println(color + text + COLOR_RESET);
    }
}
