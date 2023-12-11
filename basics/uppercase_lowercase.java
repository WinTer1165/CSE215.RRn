import java.util.Scanner;

public class uppercase_lowercase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a lowercase character: ");
        char alpha = input.next().charAt(0);
        System.out.println("Uppercase: "+ Character.toUpperCase(alpha));
        System.out.print("Now enter a uppercase character: ");
        alpha = input.next().charAt(0);
        System.out.println("Lowercase: "+ Character.toLowerCase(alpha));
        input.close();
    }
}