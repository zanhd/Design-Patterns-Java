package AbstractClass;

public abstract class Recipe {
    // This method defines the template method
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // These methods will be overridden by subclasses
    public abstract void brew();
    public abstract void addCondiments();

    // These methods are common and will not be overridden
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Hook method, can be overridden by subclasses but it's optional
    public boolean customerWantsCondiments() {
        return true;
    }
}