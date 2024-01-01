public class PartTime extends Faculty{
    private double hours;
    private double rate;

    PartTime(){

    }
    public PartTime(String name, int age, String dept_name, String designation, double hours, double rate) {
        super(name, age, dept_name, designation);
        this.hours = hours;
        this.rate = rate;
    }

    public int getAge() {
        return super.getAge();
    }

    public String getDept_name() {
        return super.getDept_name();
    }

    public String getDesignation() {
        return super.getDesignation();
    }

    public String getName() {
        return super.getName();
    }

    public double getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }

    public void setAge(int age) {
        super.setAge(age);
    }

    public void setDept_name(String dept_name) {
        super.setDept_name(dept_name);
    }

    public void setDesignation(String designation) {
        super.setDesignation(designation);
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String toString() {
        return super.toString() + "\nHours: " + hours + "\nRate: " + rate;
    }

    public double salary() {
        //return hours * rate;
        return this.getHours() * this.getRate();
    }

}
