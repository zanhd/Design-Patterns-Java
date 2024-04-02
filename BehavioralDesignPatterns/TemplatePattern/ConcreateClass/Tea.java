package ConcreateClass;

import AbstractClass.Recipe;

public class Tea extends Recipe {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    // Override the hook method to change behavior
    @Override
    public boolean customerWantsCondiments() {
        // In this example, we override the hook method to allow customer choice
        // Return false if the customer doesn't want condiments
        return false;
    }
}