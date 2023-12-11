public class hollow_rhombus_pattern {

    public static void main(String[] args) {
        int col = 10;
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int k = rows; k >= i; k--) {
                System.out.printf(" ");
            }
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == rows||j ==1||j ==col) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }

            }
            System.out.printf("\n");
        }
    }
}