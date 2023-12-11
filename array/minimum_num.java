import java.util.Scanner;

public class minimum_num {

    public static final int SIZE = 100;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("How many array you want? ");

        int n = input.nextInt();
        int array[] = new int[SIZE];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int max = array[0];
        System.out.printf("ARRAY: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d  ", array[i]);
            if (array[i] < max) {
                max = array[i];
            }
        }
        
        System.out.printf("\nMinimum Number: %d", max);
        input.close();
    }
}