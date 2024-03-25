import ConcreteCreater.ConcretePizzaFactory;
import Creater.PizzaFactory;
import Product.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new ConcretePizzaFactory();

        Pizza pizza = factory.createPizza("Margherita");
        factory.order(pizza);

        pizza = factory.createPizza("Peperoni");
        factory.order(pizza);

    }
}
