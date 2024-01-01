public class Faculty extends Employee1 {
    private String initial;
    private String rank;

    public Faculty() {
    };

    public Faculty(String name, String gender, int age, String id, String deparment, double salary, String initial,
            String rank) {
        super(name, gender, age, id, deparment, salary);
        this.initial = initial;
        this.rank = rank;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        String info = new String();
        info = info + "Name	  : " + this.getName() + "\n";
        info = info + "Gender 	 : " + this.getGender() + "\n";
        info = info + "Age	 : " + this.getAge() + "\n";
        info = info + "ID 	 : " + this.getId() + "\n";
        info = info + "Deparment : " + this.getDeparment() + "\n";
        info = info + "Salary 	 : " + this.getSalary() + "\n";
        info = info + "Initial  : " + this.getInitial() + "\n";
        info = info + "Rank 	 : " + this.getRank() + "\n";

        return info;

    }
}