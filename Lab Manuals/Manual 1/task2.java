import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = input.nextInt();
        input.close();
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println(number + " is prime number");
        } else
            System.out.println(number + " is not prime number");

    }
}
