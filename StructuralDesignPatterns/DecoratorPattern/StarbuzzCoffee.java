import Beverage.Beverage;
import Beverage.Coffee.Espresso;
import Condiment.Mocha;
import Condiment.Whip;

public class StarbuzzCoffee {

    public static void printDetails(Beverage beverage) {
        System.out.println(beverage.description() + " $" + beverage.cost());
    }

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        printDetails(beverage);

        beverage = new Mocha(beverage);
        printDetails(beverage);

        beverage = new Whip(beverage);
        printDetails(beverage);

    }
}
