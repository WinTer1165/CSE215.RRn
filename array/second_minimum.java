import java.util.Scanner;
import java.util.Arrays;

public class second_minimum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("How many array numbers you want? ");
        int n = input.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter value index at "+ (i+1) + ": ");
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        // for(int num:array){
        //     System.out.print(num);
        // }
        
        System.out.println("Second Smallest Number is "+ array[1]);
        input.close();
    }
}