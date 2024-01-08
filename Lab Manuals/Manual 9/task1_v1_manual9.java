import java.util.Scanner;

public class task1_v1_manual9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, num, i = 1;

        while (i <= 10) {
            System.out.printf("Enter %d number: ", i);
            num = sc.nextInt();
            if (num < 0) {
                System.out.printf("Input Positive Integers only\n");

            } else {
                sum += num;
                i++;
            }
        }
        System.out.println("SUM: " + sum);
        sc.close();
    }

}
