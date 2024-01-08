import java.util.Scanner;

public class task2_manual9 {
    public static void main(String[] args) {
        int arr[] = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        
        // for(int i = 0 ; i<100; i++){
        // System.out.print(arr[i] + " ,");
        // }

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("\nEnter an index to get a number: ");
            System.out.println(arr[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index number not found!!!");
        }

        input.close();
    }
}
