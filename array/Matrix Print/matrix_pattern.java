//Write a program to read a n*n matrix A from user (n is a user input) and 
//print the (i)upper left, (ii) lower right, (iii) upper right, and 
//(iv) lower left triangle, (v) diagonal and (vi) reverse diagonal of A.

import java.util.*;

public class matrix_pattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter row value: ");
        int row = input.nextInt();
        System.out.printf("Enter column value: ");
        int col = input.nextInt();
        int matrix[][] = new int[row][col];
        int k = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.printf("\n");
        }

        System.out.printf("\nupper left: \n");
        int reducing_col = col;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < reducing_col; j++) {
                System.out.printf("%3d ", matrix[i][j]);

            }
            System.out.printf("\n");
            reducing_col--;
        }

        System.out.printf("\nlower right: \n");
        int reverse_increasing_col = col - 1;
        for (int i = 0; i < row; i++) {
            for (k = i; k < col; k++) {
                System.out.printf("   ");
            }
            for (int j = reverse_increasing_col; j < col; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.printf("\n");
            reverse_increasing_col--;
        }

        System.out.printf("\nupper right: \n");
        int starting_col = 0;
        for (int i = 0; i < row; i++) {
            for (k = 1; k <= i; k++) {
                System.out.printf("    ");
            }
            for (int j = starting_col; j < col; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.printf("\n");
            starting_col++;
        }

        System.out.printf("\nlower left triangle: \n");
        int increasing_col = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < increasing_col; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.printf("\n");
            increasing_col++;
        }

        System.out.printf("\ndiagonal: \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    System.out.printf("%3d ", matrix[i][j]);
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.printf("\n");
        }

        System.out.printf("\nreverse diagonal: \n");
        k = col - 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // i+j == 2 only works for 3*3 matrix
                if (j == k) {
                    System.out.printf("%3d ", matrix[i][j]);
                } else {
                    System.out.printf("   ");
                }
            }
            k--;
            System.out.printf("\n");
        }

        input.close();
    }
}