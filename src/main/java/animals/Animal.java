package animals;

import colors.TextColorChange;

public class Animal implements TextColorChange{
    //Constructor variables deffinition.
    int height;
    int weight;
    int age;

    public Animal(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public void writeColoredText(String color, String text) {
        System.out.println(color + text + COLOR_RESET);
    }

}
