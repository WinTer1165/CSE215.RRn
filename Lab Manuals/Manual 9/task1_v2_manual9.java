import java.util.Scanner;

public class task1_v2_manual9 {

    public static void checkNum(int num) throws IllegalNegativeValues {
        if (num < 0) {
            throw new IllegalNegativeValues("Enter Positive values only!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, num, i = 1;

        while (i <= 10) {
            System.out.printf("Enter %d number: ", i);
            num = sc.nextInt();
            try {
                checkNum(num);
                sum += num;
                i++;
            } catch (IllegalNegativeValues e) {
                e.printStackTrace();

            }

        }
        System.out.println("SUM: " + sum);
        sc.close();
    }
}
