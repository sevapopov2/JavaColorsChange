import animals.Cat;

public class Main {
    public static void main(String[] args) {
        Cat murka = new Cat(250, 3700, 1);
        ColoredTextprinting secondExample = new ColoredTextprinting();
        murka.hideFromHuman(true);
        murka.hideFromHuman(false);
        secondExample.printRandomText();
    }
}       