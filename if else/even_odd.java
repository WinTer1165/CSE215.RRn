import java.util.Scanner;

public class even_odd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = input.nextInt();
        input.close();
        if (num % 2 == 0 && num!=0) {
            System.out.println(num + " is even");
        }
        else if (num % 2 != 0 && num!=0) {
            System.out.println(num + " is odd");
        }
        else{
            System.out.println(num + " is not even/odd");
        }
    }
}