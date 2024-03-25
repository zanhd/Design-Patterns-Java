package ConcreteCreater;

import ConcreteProduct.MargheritaPizza;
import ConcreteProduct.PeperoniPizza;
import Creater.PizzaFactory;
import Product.Pizza;

public class ConcretePizzaFactory extends PizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        if(type.equals("Margherita")) {
            return new MargheritaPizza();
        } else if (type.equals("Peperoni")) {
            return new PeperoniPizza();
        } else {
            return null;
        }
    }
}
