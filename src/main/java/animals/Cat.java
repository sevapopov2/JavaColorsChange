package animals;

import colors.TextColorChange;

public class Cat extends Animal implements TextColorChange{

    public Cat(int height, int weight, int age) {
        super(height, weight, age);
    }

    public boolean hideFromDaddy(boolean hide) {
        if (hide) {
            writeColoredText(BLACK_COLOR, "I hided from him! Hahahaha! I am in a black mask!");
        } else {
            writeColoredText(RED_COLOR, "Oh no! He can find me! I am afraid! Aaa!");
        }
        return hide;
    }
@Override
public void writeColoredText(String color, String text) {
    System.out.println(color + text + COLOR_RESET);
}    
}
