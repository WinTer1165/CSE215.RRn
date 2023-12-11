import java.util.Scanner;

public class array_task1 {
    public static int ComputeAverage(int array[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum / n;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many array you want? ");
        int n = input.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a input at " + (i + 1) + " index: ");
            array[i] = input.nextInt();
        }
        input.close();

        int average = ComputeAverage(array, n);
        System.out.println("Average: " + average);

        int counter = 0;
        for (int i = 0; i < n; i++) {
           if (average>array[i]) {
            counter++;
           }
        }
        System.out.println("Percentage of number greater than average: " + (counter*100)/6+"%.");
    }
}