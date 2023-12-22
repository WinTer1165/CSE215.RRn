import java.util.Scanner;

public class loop_task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter row value: ");
        int row = input.nextInt();
        input.close();

        System.out.printf("A: \n");
        for (int i = row; i >= 1; i--) {
            for(int k = row; k>=i; k--){
                 System.out.printf(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.printf("%d", j);
            }
            System.out.printf("\n");
        }

        System.out.printf("\nB: \n");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d", j);
            }
            System.out.printf("\n");
        }

        System.out.printf("\nC: \n");
        int star = 1;
        for (int i = 1; i <= row; i++) {
            for (int k = row; k >= i; k--) {
                System.out.printf(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.printf("*");
            }
            star += 2;
            System.out.printf("\n");
        }

        System.out.printf("\nD: \n");
        for (int i = row; i >= 1; i--) {
            for (int k = i; k <= row; k++) {
                System.out.printf(" ");
            }
            for (int j = 1; j <= (i*2-1); j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
