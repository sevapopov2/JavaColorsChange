import colors.TextColorChange;

public class ColoredTextprinting implements TextColorChange{
    @Override
    public void writeColoredText(String color, String text) {
        System.out.println(color + text + COLOR_RESET);
    }
    public void printRandomText() {
        writeColoredText(RED_COLOR, "My name is Seva. This is the second random example to make sure everything really works.....");
    }
}
