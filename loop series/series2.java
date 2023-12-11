// Write a program to compute the following series using while loop:  5^2+9^2+15^2+23^2+....+ n^2 but difference increasing

public class series2 {
    public static void main(String[] args) {
        int num = 4;
        int initial_num = 5;
        int difference = 4;
        int sum = 0;
        
        for(int i = 1; i<=num; i++){
            sum+=(initial_num*initial_num);
            initial_num+=difference;
            difference+=2;
        }
        
        System.out.printf("\nSUM: "+sum);
    }
    
}