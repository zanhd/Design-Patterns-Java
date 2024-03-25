package Condiment;

import Beverage.Beverage;
import Decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 30;
    }

}
