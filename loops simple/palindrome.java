public class palindrome {
    public static void main(String[] args) {
        int num = 121;
        int remainder = 0;
        int reverse_number = 0;

        int temp = num;

        while (num != 0) {
            remainder = num % 10;
            reverse_number = reverse_number * 10 + remainder;
            num /= 10;
        }
        if (temp == reverse_number) {
            System.out.println(temp + " is palindrome");
        } else {
            System.out.println(temp + " is not palindrome");
        }

    }
}
