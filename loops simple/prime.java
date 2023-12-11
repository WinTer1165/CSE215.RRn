import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = input.nextInt();
        int counter = 0;
        input.close();

        for(int i = 1; i<=num; i++ ){
            if (num%i==0) {
               counter++; 
            }
        }
        if (counter == 2) {
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
    }
}
