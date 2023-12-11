import java.util.Scanner;

public class array_task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter row value: ");
        int row = input.nextInt();
        System.out.printf("Enter column value: ");
        int col = input.nextInt();
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter a value indexed at " + (i + 1) + " " + (j + 1) + ": ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.printf("\nHere's the matrix: \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d  ", matrix[i][j]);
            }
            System.out.printf("\n");
        }

        int sum_row1 = 0, sum_row2 = 0, sum_row3 = 0, sum_col1 = 0, sum_col2 = 0, sum_col3 = 0, diagonal_sum = 0,
                reverse_diagonal = 0;

        int k = col - 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == 0) {
                    sum_col1 += matrix[i][j];
                }
                if (j == 1) {
                    sum_col2 += matrix[i][j];
                }
                if (j == 2) {
                    sum_col3 += matrix[i][j];
                }
                if (i == 0) {
                    sum_row1 += matrix[i][j];
                }
                if (i == 1) {
                    sum_row2 += matrix[i][j];
                }
                if (i == 2) {
                    sum_row3 += matrix[i][j];
                }
                if (i == j) {
                    diagonal_sum += matrix[i][j];
                }
                if (j == k) {
                    reverse_diagonal += matrix[i][j];
                    k--;
                }

            }
            System.out.printf("\n");
            System.out.printf("Row 1 Sum: %d\n", sum_row1);
            System.out.printf("Row 2 Sum: %d\n", sum_row2);
            System.out.printf("Row 2 Sum: %d\n", sum_row3);
            System.out.printf("Column 1 Sum: %d\n", sum_col1);
            System.out.printf("Column 2 Sum: %d\n", sum_col2);
            System.out.printf("Column 3 Sum: %d\n", sum_col3);
            System.out.printf("Diagonal Sum: %d\n", diagonal_sum);
            System.out.printf("Reverse Diagonal Sum: %d\n", reverse_diagonal);
        }

        input.close();
    }
}