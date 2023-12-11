import java.util.Scanner;

public class divisible_by_3_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        float num = input.nextFloat();
        input.close();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Number divisible by both 3 and 5");
        } else if (num % 3 == 0) {
            System.out.println("Number divisible by 3");
        } else if (num % 5 == 0) {
            System.out.println("Number divisible by 5");
        } else {
            System.out.println("Number not divisible by 3 or 5");
        }
    }
}