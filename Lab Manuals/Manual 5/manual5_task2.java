import java.util.Scanner;

class Circle {
    float radius;
    String color;

    Circle() {
        radius = 0;
        color = "null";
    }

    Circle(float r, String c) {
        this.radius = r;
        this.color = c;
    }

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

public class manual5_task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Circle myCircle1 = new Circle( 5, "yellow");

        myCircle1.Area();
        myCircle1.Perimeter();
        myCircle1.Color();

        input.close();
    }
}
