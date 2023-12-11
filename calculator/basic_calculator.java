import java.util.Scanner;

public class basic_calculator {

    static float Sum(float x, float y) {
        return x + y;
    }

    static float Difference(float x, float y) {
        return x - y;
    }

    static float Product(float x, float y) {
        return x * y;
    }

    static float Quotient(float x, float y) {
        if (y == 0) {
            System.out.println("undefined!!! You can't divide by 0(zero).");
            return x / y;
        } else {
            return x / y;
        }

    }

    static void Calculator() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter 1st Number: ");
        float a = input.nextFloat();
        System.out.printf("Enter 2nd Number: ");
        float b = input.nextFloat();
        System.out.printf("Select your operator(+,-,/,*): ");
        String operator = input.next();

        switch (operator) {
            case "+":
                System.out.println("SUM: " + Sum(a, b));

                break;
            case "-":
                System.out.println("Difference: " + Difference(a, b));

                break;
            case "/":
                System.out.println("Quotient: " + Quotient(a, b));
                break;
            case "*":
                System.out.println("Product: " + Product(a, b));

                break;
            default:
                System.out.printf("Invalid Operator!!!");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user_input;
        while (true) {
            Calculator();
            System.out.printf("Wanna go again?(Type 'y' to continue, 'n' to close): ");
            user_input = input.nextLine();
            if (user_input.equals("n")) {
                System.out.printf("Code ended successfully!");
                break;
            } else if (user_input.equals("y")) {
                continue;
            } else {
                System.out.println("Invalid Command!!! Code ended!!!");
                break;
            }
        }
        input.close();
    }

}