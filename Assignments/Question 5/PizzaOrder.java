public class PizzaOrder {
    private Pizza[] pizzas;
    private int maxPizzas;

    public PizzaOrder() {
        this.pizzas = new Pizza[3];
        this.maxPizzas = 0;
    }

    public void addPizza(Pizza pizza) {
        if (maxPizzas < 3) {
            pizzas[maxPizzas] = pizza;
            maxPizzas++;
        } else {
            System.out.println("Maximum number of pizzas reached!");
        }
    }

    public double TotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < maxPizzas; i++) {
            totalCost += pizzas[i].costCalculation();
        }
        return totalCost;
    }

  
   
}
