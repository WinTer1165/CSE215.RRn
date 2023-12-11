//4 - 4^3 + 4^5 - 4^7 + 4^9 - 4^11 + 4^13 - 4^15 + 4^17-.... 
//x^1-x^3+x^5-....
import java.lang.Math;

public class series3 {
    public static void main(String[] args) {
        int num = 5;
        int base_num = 2;
        int power = 1;
        int even_sum = 0;
        int odd_sum = 0;

        for(int i = 1; i<=num; i++){

            if (i%2==0) {
                even_sum+=Math.pow(base_num, power);
                System.out.printf("%d^%d + ", base_num, power);
            }
            else {
                odd_sum+=Math.pow(base_num, power);
                System.out.printf("%d^%d - ", base_num, power);
            }
            power+=2;
        }
        
        System.out.println("SUM: "+ (odd_sum-even_sum));
    }
    
}