public class Writer {
    private String writerName;
    private double price;
    private int sold;

    Writer() {
    }

    Writer(String writerName, double price, int sold) {

        this.writerName = writerName;
        this.price = price;
        this.sold = sold;
    }

    public double getPrice() {
        return price;
    }

    public int getSold() {
        return sold;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    //void because I was feeling a little lazy ;) 
    public void TotalEarning(Writer[] w) {
        double earnings = 0, temp = 0;
        for (int i = 0; i < w.length; i++) {
            if (writerName.equals(w[i].getWriterName())) {
                temp = w[i].getSold() * w[i].getPrice();
                earnings += temp;
            }
        }
        earnings = earnings*0.15;
        System.out.printf("Total Earning of %s is %.2f", writerName, earnings);

    }

    public String toString() {

        return "Writer Name: " + writerName + ", Price: " + price + ", Sold: " + sold;
    }
}
