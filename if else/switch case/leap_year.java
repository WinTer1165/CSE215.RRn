import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.close();
        boolean value = (year % 400 == 0);
        boolean value2 = (year % 4 == 0 && year % 100 != 0);
        switch (value + "+" + value2) {
            case "true+false":
                System.out.println(year + " is a leap year");
                break;
            case "false+true":
                System.out.println(year + " is a leap year");
                break;
            default:
                System.out.println(year + " is not a leap year");
                break;
        }
    }
}
