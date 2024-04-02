package Client;

import AbstractClass.Recipe;
import ConcreateClass.Coffee;
import ConcreateClass.Tea;

public class Main {
    public static void main(String[] args) {
        Recipe coffeeRecipe = new Coffee();
        Recipe teaRecipe = new Tea();

        System.out.println("Making coffee...");
        coffeeRecipe.prepareRecipe();

        System.out.println("\nMaking tea...");
        teaRecipe.prepareRecipe();
    }
}

/*
OUTPUT :
Making coffee...
Boiling water
Dripping coffee through filter
Pouring into cup
Adding sugar and milk

Making tea...
Boiling water
Steeping the tea
Pouring into cup
 */
