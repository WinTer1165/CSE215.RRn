public class reverse_number {
    public static void main(String[] args) {
        int num = 123;
        int remainder = 0;
        int reverse_number = 0;
        while (num!=0) {
            remainder=num%10;
            reverse_number =reverse_number*10+remainder;
            num/=10;
        }
        System.out.println("Reverse Number: "+ reverse_number);
    }
}
