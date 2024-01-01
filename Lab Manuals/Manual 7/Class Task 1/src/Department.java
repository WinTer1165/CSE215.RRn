public class Department{

    private String Dept_name;
    private String Chair_name;

    Department(){}

    Department(String Dept_name, String Chair_name){
        this.Chair_name = Chair_name;
        this.Dept_name = Dept_name;
    }

    public String getDept_name() {
        return Dept_name;
    }

    public String getChair_name() {
        return Chair_name;
    }

    public void setDept_name(String dept_name) {
        Dept_name = dept_name;
    }

    public void setChair_name(String chair_name) {
        Chair_name = chair_name;
    }


    public String toString() {
        return "\nDepartment Name: "+ Dept_name + "\nChair Name: "+ Chair_name;
    }
}
