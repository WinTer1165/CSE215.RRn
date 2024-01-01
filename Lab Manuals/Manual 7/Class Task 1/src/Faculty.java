public class Faculty {

    private String name;
    private int age;
    private String dept_name;
    private String designation;

    Faculty(){}
    Faculty(String name, int age, String dept_name, String designation){
        this.name = name;
        this.age = age;
        this.dept_name = dept_name;
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public String getDept_name() {
        return dept_name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String toString() {
        return "\nname: " + name +"\nage: " + age + "\ndept_name: " + dept_name + "\ndesignation: " + designation;
    }
}
