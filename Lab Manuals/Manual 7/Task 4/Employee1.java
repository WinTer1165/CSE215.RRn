public class Employee1 extends Person1 {
    private String id;
    private String deparment;
    private double salary;

    public Employee1() {
    };

    public Employee1(String name, String gender, int age, String id, String deparment, double salary) {
        super(name, gender, age);
        this.id = id;
        this.deparment = deparment;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}