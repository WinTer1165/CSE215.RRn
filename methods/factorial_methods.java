public class factorial_methods {

    static int fact(int x){
        int product = 1;
        for(int i = 1; i<=x; i++){
            product*=i;
        }
        return product;
    }
    public static void main(String[] args){
        System.out.println("Factorial: "+ fact(5));
    }
}