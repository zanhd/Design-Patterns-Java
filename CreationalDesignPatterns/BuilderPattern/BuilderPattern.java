import Model.Pizza;

public class BuilderPattern {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .dough("thin")
                .souce("tomato")
                .topping("ham and pineapple")
                .build();

        pizza.showPizza();

    }
}
