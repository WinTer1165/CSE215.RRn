public class square_pattern {

    public static void main(String[] args) {
        int col = 10;
        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
