package ConcreteProduct;

import Product.Pizza;

public class PeperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Peperoni Pizza ...");
    }

    @Override
    public void bake() {
        System.out.println("Baking Peperoni Pizza ...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Peperoni Pizza ...");
    }

    @Override
    public void box() {
        System.out.println("Boxing Peperoni Pizza ...");
    }
}
