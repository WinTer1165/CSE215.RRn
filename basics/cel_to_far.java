import java.util.Scanner;
import java.text.DecimalFormat;

public class cel_to_far {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float temp = input.nextFloat();
        DecimalFormat decimal = new DecimalFormat("#.###");
        input.close();
        float fahrenheit =  ((temp*9)/5)+32;
        System.out.println("Fahrenheit Temperature: "+ decimal.format(fahrenheit)+" degree");

    }
}