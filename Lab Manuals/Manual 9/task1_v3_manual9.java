import java.util.Scanner;

public class task1_v3_manual9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, num, i = 1;

        while (i <= 10) {
            System.out.printf("Enter %d number: ", i);
            num = sc.nextInt();

            try {
                if (num < 0) {
                    throw new Exception("You gave a Negative Integer:3");
                } else {
                    sum += num;
                    i++;
                }
            } catch (Exception e) {
                System.out.println("Input Positive Integers only\n");
            }
        }
        System.out.println("SUM: " + sum);
        sc.close();
    }

}
