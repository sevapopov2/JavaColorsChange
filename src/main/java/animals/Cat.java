package animals;

import colors.TextColorChange;

public class Cat extends Animal implements TextColorChange{

    public Cat(int height, int weight, int age) {
        super(height, weight, age);
    }

    public boolean hideFromHuman(boolean hide) {
        if (hide) {
            writeColoredText(BLACK_COLOR, "I am a cat! I hided from human! I am in black shadows!");
        } else {
            writeColoredText(RED_COLOR, "Oh no! Human can find and catch me! I am afraid! I became red because of that!");
        }
        return hide;
    }
@Override
public void writeColoredText(String color, String text) {
    System.out.println(color + text + COLOR_RESET);
}    
}
