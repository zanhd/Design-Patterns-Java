package Facade;

import ComplexSubsystem.DeliveryPerson;
import ComplexSubsystem.Oven;
import ComplexSubsystem.PizzaChef;

// Facade class
public class PizzaOrderingSystem {
    private PizzaChef chef;
    private Oven oven;
    private DeliveryPerson deliveryPerson;

    public PizzaOrderingSystem() {
        this.chef = new PizzaChef();
        this.oven = new Oven();
        this.deliveryPerson = new DeliveryPerson();
    }

    public void orderPizza() {
        chef.preparePizza();
        oven.bakePizza();
        deliveryPerson.deliverPizza();
    }
}
