import java.util.Scanner;

public class loop_task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter lowest range: ");
        int lowest_range = input.nextInt();
        System.out.printf("Enter highest range: ");
        int highest_range = input.nextInt();
        input.close();

        for (int i = highest_range; i >= lowest_range; i--) {
            if (i % 8 == 0) {
                System.out.printf("%d  ", i);
            }
        }
    }
}