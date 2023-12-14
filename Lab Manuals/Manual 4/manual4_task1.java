import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class manual4_task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a side: ");
        float side = input.nextFloat();
        input.close();
        float area = (float) ((3 * side * side * Math.sqrt(3)) / 2);

        System.out.printf("Area of hexagon up to 2 decimals: %.2f\n", area);

        DecimalFormat decimal = new DecimalFormat();
        decimal.setMaximumFractionDigits(3);
        System.out.println("Area of hexagon up to 3 decimals: " + decimal.format(area));

        float area_v2 = (float) ((6 * side * side) / (4 * Math.tan(3.1416 / 6)));
        System.out.printf("Area of hexagon up to 2 decimals: %.2f\n", area_v2);
        decimal.setMaximumFractionDigits(4);
        System.out.println("Area of hexagon up to 4 decimals: " + decimal.format(area_v2));
    }
}