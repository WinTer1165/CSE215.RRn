
import java.util.Scanner;

public class no_odd_even {
    public static final int SIZE = 100;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("How many array you want? ");
        int n = input.nextInt();

        int array[] = new int[SIZE];
        int odd_array[] = new int[SIZE];
        int even_array[] = new int[SIZE];

        int temp_odd = 0, temp_even = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter a value at " + (i + 1) + " index: ");
            array[i] = input.nextInt();
            if (array[i] % 2 == 0) {
                even_array[temp_even] = array[i];
                temp_even++;
            } else {
                odd_array[temp_odd] = array[i];
                temp_odd++;
            }
        }
        System.out.printf("\nEven numbers: ");
        for (int j = 0; j < temp_even; j++) {
            System.out.printf("%d  ", even_array[j]);
        }
        System.out.printf("\nOdd numbers: ");
        for (int j = 0; j < temp_odd; j++) {
            System.out.printf("%d  ", odd_array[j]);
        }
        System.out.printf("\nNo of Even numbers is: %d\nNo of Odd numbers is: %d", temp_even, temp_odd);
        input.close();
    }
}