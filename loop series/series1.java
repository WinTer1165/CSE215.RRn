//   1/2 + 2/(1+2) + 3/(1+2+3)+....

public class series1 {
    public static void main(String[] args) {
        int series = 5;
        float sum1 = 0;
        float sum2 = 0;
        float start_num = 1;
        for(int i = 1; i<=series;i++){
            sum2 = 0;
            System.out.printf("%d/(", i);
            for(int j = 1; j<=start_num; j++){
                
                 if (j==start_num) {
                     System.out.printf("%d", j);
                 }
                 else{
                    System.out.printf("%d+", j);
                 }
                 sum2+=j;
            }
            System.out.printf(") + ");
            sum1+=(start_num/sum2);
            start_num++;
        }
        System.out.printf("\nSUM: "+sum1);
    }
    
}