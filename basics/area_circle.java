import java.util.*;

public class area_circle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter radius of the circle: ");
        float radius = input.nextFloat();
        input.close();
        System.out.println("Area: " + (3.1416* radius *radius) + "\nPerimeter: "+ (2*3.1416* radius));
    }
}