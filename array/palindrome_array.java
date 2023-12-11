import java.util.Scanner;

public class palindrome_array {

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
        System.out.printf("Main array: ");
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

        // for(int num:temp_reverse_array){
        // System.out.print(num);
        // }
        // for(int num:array){
        // System.out.print(num);
        // }

        // checking reversed array with original array
        int counter = 0;
        for (int k = 0; k < n; k++) {
            if (array[k] == temp_reverse_array[k]) {
                counter++;
            }
        }

        // printing result
        if (counter == n) {
            System.out.printf("\nThis array is palindrome.");
        } else {
            System.out.printf("\nThis array is not palindrome");
        }

        input.close();
    }
}