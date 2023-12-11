import java.util.Scanner;

public class three_by_three {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter row value: ");
        int row = input.nextInt();
        System.out.printf("Enter column value: ");
        int col = input.nextInt();
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter a value indexed at " + (i + 1) + (j + 1) + ": ");
                matrix[i][j] = input.nextInt();

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.printf("\n");
        }
        input.close();
    }
}