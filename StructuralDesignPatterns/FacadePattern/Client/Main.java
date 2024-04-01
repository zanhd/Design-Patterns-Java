package Client;

import Facade.PizzaOrderingSystem;

public class Main {
    public static void main(String[] args) {
        PizzaOrderingSystem pizzaSystem = new PizzaOrderingSystem();
        pizzaSystem.orderPizza();
    }
}
