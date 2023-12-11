import java.util.*;

public class maximum_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        input.close();

        boolean value = num1 > num2 && num1 > num3;
        boolean value2 = num2 > num3;

        switch (value + "-") {
            case "true-":
                System.out.print(num1 + " is largest number");
                break;
            case "false-":
                switch (value2 + "-") {
                    case "true-":
                        System.out.print(num2 + " is largest number");
                        break;
                    case "false-":
                        System.out.print(num3 + " is largest number");
                        break;
                }
                break;
        }
    }
}
