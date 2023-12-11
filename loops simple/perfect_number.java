public class perfect_number {
    public static void main(String[] args) {
        int number = 496;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (number == sum) {
            System.out.println(number + " is perfect number");
        } else {
            System.out.println(number + " is not perfect number");
        }
    }
}