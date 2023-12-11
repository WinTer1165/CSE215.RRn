public class perfect_number_2 {
    public static void main(String[] args) {
        int limit = 10000, j;

        for (int i = 1; i < limit; i++) {
            int sum = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.printf(i + ", ");
            }
        }
    }
}
