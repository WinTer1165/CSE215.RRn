import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class area_hexagon {

    public static void main(String[] args){
       Scanner input= new Scanner(System.in);
       System.out.printf("Enter a side: ");
       float side = input.nextFloat();
       input.close();
       float area = (float)((3*side*side*Math.sqrt(3))/2);
       System.out.printf("Area of pentagon: %.2f\n", area);

       DecimalFormat decimal = new DecimalFormat();
       decimal.setMaximumFractionDigits(3);
       System.out.println("Area of pentagon: " + decimal.format(area));
    
    }
}