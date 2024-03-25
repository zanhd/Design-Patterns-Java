package Beverage;

public abstract class Beverage {
    public String description = "Unknown Beverage";
    public String description() {
        return description;
    }

    public abstract double cost();
}
