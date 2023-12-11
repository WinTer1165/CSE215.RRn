import java.util.Scanner;

public class prime_methods {

    static void PrimeNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = input.nextInt();
        input.close();

        for (int j = 2; j <= num; j++) {
            int counter = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.printf(j + ", ");
            }
        }
        System.out.printf("are a prime number");
    }
    public static void main(String[] args) {
       PrimeNumbers(); 
    }
}