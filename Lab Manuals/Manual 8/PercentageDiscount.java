public class PercentageDiscount implements Discountable {
    private double percentage;

    PercentageDiscount() {}

    PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    double getPercentage() {
        return percentage;
    }

    void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double discountedPrice(double price) {
        return (price - (price * percentage) / 100);
    }
}