import java.util.Scanner;

public class loop_task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("How many times you want to print your name? : ");
        int num = input.nextInt();
        input.nextLine();
        System.out.printf("Enter your name : ");
        String myName = input.nextLine();
        input.close();
        for (int i = 1; i <= num; i++) {
            System.out.println(i + ". " + myName);
        }
    }
}
