public class hollow_rectangle_pattern {

    public static void main(String[] args) {
        int col = 10;
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {
                if (i==1||i==rows||j==col||j ==1) {
                    System.out.printf("*");
                }
                else{
                    System.out.printf(" ");
                }
                
            }
            System.out.printf("\n");
        }
    }
}
