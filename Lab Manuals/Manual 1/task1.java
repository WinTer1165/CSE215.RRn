import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = input.nextInt();
        input.close();
        boolean value = (num%2==0);
        switch (value+"0"){
            case "true0":
                System.out.println(num + " is even");
                break;
            case "false0":
                System.out.println(num + " is odd");
                break;
            default:
                System.out.println("Invalid not a integer number");
                break;
        }
    }
}