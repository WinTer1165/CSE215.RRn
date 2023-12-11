//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,......

public class Fibonacci {
    public static void main(String[] args) {
        int first_number = 0;
        int next_number = 1;
        int temp;
        
        for(int i = 1; i<=10;i++){
            System.out.print(first_number+", ");
            temp = first_number + next_number;
            first_number = next_number;
            next_number = temp;
        } 
    }
    
}