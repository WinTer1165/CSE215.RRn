import java.util.*;

public class minimum_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        input.close();

        if (num1<num2 && num1<num3) {
             System.out.print(num1+" is lowest number");
        }
        else if (num2<num3) {
            System.out.print(num2+" is lowest number");
        }
        else{
            System.out.print(num3+" is lowest number");
        }
    }
}
