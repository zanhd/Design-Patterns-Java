package Condiment;

import Beverage.Beverage;
import Decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 20; //adding cost of Mocha
    }
}
