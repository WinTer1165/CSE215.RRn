import java.util.Scanner;

class Circle {
    float radius;
    String color;

    void Area() {
        System.out.println("Area: " + (3.1416 * radius * radius));
    }

    void Perimeter() {
        System.out.println("Perimeter: " + (2 * 3.1416 * radius));
    }

    void Color() {
        System.out.println("You have chosen " + color + " color.");
    }
}

public class manual5_task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Circle myCircle1 = new Circle();

        System.out.printf("Enter radius of the circle: ");
        myCircle1.radius = input.nextFloat();
        myCircle1.Area();
        myCircle1.Perimeter();

        input.nextLine();
        System.out.printf("Enter color for your circle: ");
        myCircle1.color = input.nextLine();
        myCircle1.Color();

        input.close();
    }
}
