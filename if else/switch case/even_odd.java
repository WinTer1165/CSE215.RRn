import java.util.Scanner;

public class even_odd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        float num = input.nextFloat();
        input.close();
        int value = (int) num % 2;

        switch (value) {
            case 0:
                System.out.println("Even number");
                break;
            case 1:
                System.out.println("Odd number");
                break;
        }
    }
}