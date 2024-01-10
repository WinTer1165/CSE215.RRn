import java.util.Scanner;

public class AssignmentTask1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a integer value: ");
        int n = sc.nextInt();
        System.out.printf("Enter order (INC/DEC): ");
        String s = sc.next().toUpperCase();

        String[][] arr = new String[n][n];
        char alpha;

        switch (s) {
            case "INC":
                for (int i = 0; i < n; i++) {
                    alpha = 'a';
                    for (int j = 0; j < i; j++) {
                        arr[i][j] = String.valueOf(alpha);
                        // printing array to show visualize the representation of the array
                        System.out.printf("%s ", arr[i][j]);
                        alpha++;
                    }
                    System.out.printf("\n");
                }
                break;

            case "DEC":

                for (int i = 0; i < n; i++) {
                    alpha = 'a';
                    for (int j = i; j < n; j++) {
                        arr[i][j] = String.valueOf(alpha);
                        // printing array to show visualize the representation of the array
                        System.out.printf("%s ", arr[i][j]);
                        alpha++;
                    }
                    System.out.printf("\n");
                }
                break;
        }
        sc.close();
    }
}