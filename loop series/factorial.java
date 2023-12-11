public class factorial {
    public static void main(String[] args) {
        int number = 10;
        int product = 1;
        for(int i = 1; i<=number;i++){
            product*=i;
        }
        System.out.println(product);
    }
    
}