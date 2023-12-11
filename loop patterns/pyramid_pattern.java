public class pyramid_pattern {

    public static void main(String[] args) {
        int n = 1;
        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            for (int k = rows; k >= i; k--) {
                System.out.printf(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.printf("*");
            }
            n += 2;
            System.out.printf("\n");
        }
    }
}