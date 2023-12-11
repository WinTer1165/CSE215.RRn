import java.util.Scanner;

public class array_task2 {
    public static int[] Fibonacci(int array[], int n) {
        
        int first_number = 0;
        int next_number = 1;
        int temp;

        for (int i = 0; i < n; i++) {
            array[i]=first_number;
            temp = first_number + next_number;
            first_number = next_number;
            next_number = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many array you want? ");
        int n = input.nextInt();
        int array[] = new int[n];
        Fibonacci(array, n);
        for (int i = 0; i < n; i++) {
           System.out.printf("%d, ", array[i]);
        }
        input.close();
    }
}