public class Pizza {
    private String pizzaSize;
    private int cheeseCount;
    private int pepperoniCount;
    private int hamCount;

    public Pizza() {
        this.pizzaSize = "";
        this.cheeseCount = 0;
        this.pepperoniCount = 0;
        this.hamCount = 0;
    }

    public Pizza(String pizzaSize, int cheeseCount, int pepperoniCount, int hamCount) {
        this.pizzaSize = pizzaSize;
        this.cheeseCount = cheeseCount;
        this.pepperoniCount = pepperoniCount;
        this.hamCount = hamCount;
    }

    public int getCheeseCount() {
        return cheeseCount;
    }
    public int getHamCount() {
        return hamCount;
    }
    public int getPepperoniCount() {
        return pepperoniCount;
    }
    public String getPizzaSize() {
        return pizzaSize;
    }
    public void setCheeseCount(int cheeseCount) {
        this.cheeseCount = cheeseCount;
    }
    public void setHamCount(int hamCount) {
        this.hamCount = hamCount;
    }
    public void setPepperoniCount(int pepperoniCount) {
        this.pepperoniCount = pepperoniCount;
    }
    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }


    public double costCalculation() {
        if (pizzaSize.equalsIgnoreCase("small")) {
            return 10 + 2;
        } else if (pizzaSize.equalsIgnoreCase("medium")) {
            return 12 + 2;
        } else if (pizzaSize.equalsIgnoreCase("large")) {
            return 14 + 2*(getCheeseCount()+ getPepperoniCount()+ getHamCount());
        }
        return 0;
    }

    public String getDescription() {
        return toString() + " Cost : " + costCalculation();
    }
    
    public String toString() {
        return "Pizza Size: " + pizzaSize + "  Cheese: " + cheeseCount + "  Pepperoni: " + pepperoniCount + "  Ham: " + hamCount;
    }
}
