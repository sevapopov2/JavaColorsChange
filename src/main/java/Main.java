import animals.Cat;
import colors.TextColorChange;

public class Main implements TextColorChange{
    public static void main(String[] args) {
        Cat murka = new Cat(250, 3700, 1);
        murka.writeColoredText(RED_COLOR, "I will destroy you! Because I am Murka!");
    }
}