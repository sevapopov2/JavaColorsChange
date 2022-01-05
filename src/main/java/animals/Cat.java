package animals;

import colors.TextColorChange;

public class Cat extends Animal implements TextColorChange{

    public Cat(int height, int weight, int age) {
        super(height, weight, age);
    }

    @Override
    public void writeColoredText(String color, String text) {
        System.out.println(color + text + COLOR_RESET);
    }
}
