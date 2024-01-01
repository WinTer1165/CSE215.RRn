public class FullTime extends Faculty {
    private double basic;
    private double allowance;

    public FullTime(){}
    public FullTime(String name, int age, String dept_name, String designation, double basic, double allowance) {
        super(name, age, dept_name, designation);
        this.basic = basic;
        this.allowance = allowance;
    }
    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double salary() {
        // return basic + allowance;
        return this.getBasic() +this.getAllowance() ;
    }

    public String toString() {
        return super.toString() + "\nBasic: "+ basic + "\nAllowance: " + allowance;
    }
}
