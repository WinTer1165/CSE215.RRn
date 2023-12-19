public class Circle {
    float radius;
    String color;

    Circle() {
        radius = 5;

    }

    Circle(float r, String c) {
        this.radius = r;
        this.color = c;
    }

    double Area() {
        double area = 3.1416 * radius * radius;
        System.out.println("Area: " + (3.1416 * radius * radius));
        return area;
    }

    double Perimeter() {
        System.out.println("Perimeter: " + (2 * 3.1416 * radius));
        return 2*3.1416*radius;
    }

    String Color() {
        System.out.println("You have chosen " + color + " color.");
        return color;
    }
}
