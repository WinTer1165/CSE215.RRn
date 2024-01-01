public class MainTest {
    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Name", 29, "Address ...", "Daperment A ",
                " Designatiom P", 100, 280);

        System.out.println("Part time Employee Salary : " + partTimeEmployee.salary());

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(" Full Name", 42, "Address 12...", "Daperment D ",
                " Designatiom M", 150000, 25);
        System.out.println("\nEmployee Salary : " + fullTimeEmployee.salary());

    }
}
