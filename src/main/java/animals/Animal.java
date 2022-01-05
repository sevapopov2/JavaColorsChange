package animals;

import colors.TextColorChange;

public abstract class Animal implements TextColorChange{
    //Constructor variables deffinition.
    String name;
    String height;
    String weight;
    String age;

    public Animal(String name, String height, String weight, String age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public void writeColoredText(String color, String text) {
        System.out.println(color + text + COLOR_RESET);
        
    }

    
}
