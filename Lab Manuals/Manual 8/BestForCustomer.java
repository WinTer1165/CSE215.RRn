public class BestForCustomer{

    private double percentage;
    private  double threshold;
    private  double discount;

    BestForCustomer(double percentage, double threshold, double discount) {

        this.percentage = percentage;
        this.threshold = threshold;
        this.discount = discount;
    }

    /*
    //Should be inside method
    BestForCustomer(double percentage, double threshold, double discount){
        t1 = new ThresholdDiscount(threshold, discount);
        p1 = new PercentageDiscount(percentage);
    }
    */


    public double discountedPrice(double price) {

        ThresholdDiscount t1 =  new ThresholdDiscount(threshold, discount);
        PercentageDiscount p1 = new PercentageDiscount(percentage);

    if (t1.discountedPrice(price)< p1.discountedPrice(price)){
        System.out.println("Best price is from Threshold Discount");
        return t1.discountedPrice(price);
    }
    else {
        System.out.println("Best price is from Percentage Discount");
        return p1.discountedPrice(price);
    }
    }

}