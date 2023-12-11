import java.util.Scanner;

public class sum_array {
    public static final int SIZE = 100;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many array you want? ");
        int n = input.nextInt();

        int array[], sum = 0;
        array = new int[SIZE];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a input at " + (i + 1) + " index: ");
            array[i] = input.nextInt();
            sum += array[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
        }

        input.close();
        System.out.print("\nSUM: " + sum);
    }
}