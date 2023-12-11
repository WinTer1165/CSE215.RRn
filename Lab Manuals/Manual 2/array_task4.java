import java.util.Scanner;

public class array_task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many array you want? ");
        int n = input.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a input at " + (i + 1) + " index: ");
            array[i] = input.nextInt();
        }

        

        for (int i = 1; i < n - 1; i++) {
            if (array[i] == array[i - 1] && array[i] == array[i + 1]) {
                System.out.printf("%d, ", array[i]);
            }
        }
        input.close();
    }
}
