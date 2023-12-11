import java.util.Scanner;

public class method_task1 {
    public static int[] countOdd(int array1[], int array2[], int n1, int n2) {
        int counter1 = 0, counter2 = 0;
        for (int i = 0; i < n1; i++) {
            if (array1[i] % 2 != 0) {
                counter1++;
            }
        }
        for (int i = 0; i < n2; i++) {
            if (array2[i] % 2 != 0) {
                counter2++;
            }
        }
        if (counter1 < counter2) {
            return array2;
        } else {
            return array1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements you want for 1st array? ");
        int n1 = input.nextInt();
        int array1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter a input at " + (i + 1) + " index: ");
            array1[i] = input.nextInt();
        }
        System.out.print("How many elements you want for 2nd array? ");
        int n2 = input.nextInt();
        int array2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter a input at " + (i + 1) + " index: ");
            array2[i] = input.nextInt();
        }
        int returned_array[] = countOdd(array1, array2, n1, n2);
        input.close();

        for (int i = 0; i < returned_array.length; i++) {
            if (returned_array[i] % 2 != 0) {
                System.out.printf("%d  ", returned_array[i]);
            }
        }
    }
}