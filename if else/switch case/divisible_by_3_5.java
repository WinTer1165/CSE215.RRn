import java.util.Scanner;

public class divisible_by_3_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        float num = input.nextFloat();
        input.close();
        int value = (int) num % 3;
        int value2 = (int) num % 5;
        switch (value + value2) {
            case 00:
                System.out.println("Number divisible by both 3 and 5");
                break;
            case 11:
                System.out.println("Number not divisible by both 3 and 5");
                break;
        }
    }
}