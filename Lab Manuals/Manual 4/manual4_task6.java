import java.lang.Math;

public class manual4_task6 {
    public static void main(String[] args) {

        int num1 = (int) (1 + Math.random() * (1000 - 1 + 1));
        int num2 = (int) (1 + Math.random() * (1000 - 1 + 1));

        int min, max;
        if (num1 < num2) {
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }
        System.out.println("Range: " + min + " " + max);
        for (int i = max; i >= min; i--) {
            if (i % 5 == 0 || i % 8 == 0) {
                System.out.printf("%d ,", i);
            }
        }
    }
}
