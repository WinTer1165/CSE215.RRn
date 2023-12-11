import java.util.Scanner;
public class task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a year ");
        int year = input.nextInt();
        input.close();
        System.out.println((year%400==0 || (year%4==0 && year%100!=0))?"Leap year":"Not Leap Year");
    }
}

