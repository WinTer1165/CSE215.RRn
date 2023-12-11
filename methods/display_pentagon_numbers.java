import java.util.Scanner;

public class display_pentagon_numbers {

    static void PentagonNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter max limit: ");
        int num = input.nextInt();
        input.close();
        int pentagon;
        for (int i = 1; i <= num; i++) {
            pentagon = (i * ((3 * i) - 1)) / 2;
            System.out.printf(pentagon + ", ");
        }
    }

    public static void main(String[] args) {
        PentagonNumbers();
    }
}