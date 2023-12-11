import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter array size: ");
        int n = input.nextInt();

        // initializing original array
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter values for your array indexed at %d: ", i + 1);
            array[i] = input.nextInt();
        }

        // printing main array
        System.out.printf("Main array without reverse: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d, ", array[i]);

        }

        // reversing array
        int temp_reverse_array[] = new int[n];
        int temp_n = n - 1;
        for (int i = 0; i < n; i++) {
            temp_reverse_array[i] = array[temp_n];
            temp_n--;
        }

        // replacing original array with reversed value
        for (int i = 0; i < n; i++) {
            array[i] = temp_reverse_array[i];
        }

        // printing reversed array
        System.out.printf("\nReverse array             : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d, ", array[i]);

        }

        input.close();
    }
}