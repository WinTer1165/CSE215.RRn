class ThresholdDiscount implements Discountable {
    private double threshold;
    private double discount;

    ThresholdDiscount(){}

    ThresholdDiscount(double threshold, double discount) {
        this.threshold = threshold;
        this.discount = discount;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double discountedPrice(double price) {
        if (price < threshold) {
            discount = 0;
            return price;
        } else
            return price - discount;
    }
}