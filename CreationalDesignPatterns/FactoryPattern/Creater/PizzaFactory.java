package Creater;

import Product.Pizza;

public abstract class PizzaFactory {
    public void order(Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("Order Completed.");
    }

    public abstract Pizza createPizza(String type); //IMP
}
