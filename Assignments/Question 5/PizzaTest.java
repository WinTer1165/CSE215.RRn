public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large", 1, 1, 2);
        Pizza pizza2 = new Pizza("medium", 1, 6, 1);
        Pizza pizza3 = new Pizza("small", 5, 10, 0);

        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
        System.out.println(pizza3.getDescription());

        //grouping pizzas together as order
        PizzaOrder order = new PizzaOrder();
        order.addPizza(pizza1);
        order.addPizza(pizza2);

        System.out.println("Total Cost : "+order.TotalCost());
    }
}