public class Main {

    public static void main(String[] args) {
        Faculty faculty = new Faculty("Prof. Give Name", "Male", 39, "93Namle", "MECH", 30000, "Prof. G. N", "237");
        System.out.println("Name: " + faculty.getName()); // display name
        System.out.println("Age: " + faculty.getAge()); // display age
        System.out.println("Salary : " + faculty.getSalary()); // display salary
        System.out.println("Initial : " + faculty.getInitial()); // display initial
        System.out.println("\n Faculty information : \n" + faculty.toString());

    }

}