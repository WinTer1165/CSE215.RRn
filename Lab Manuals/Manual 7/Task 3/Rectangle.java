public class Rectangle extends Shape {
    private double side1;
    private double side2;

    Rectangle(double sd1, double sd2, String nm) {

        super(nm);
        side1 = sd1;
        side2 = sd2;
    }

    void setSide1(double sd1) {
        side1 = sd1;
    }

    void setSide2(double sd2) {
        side2 = sd2;
    }

    double getSide1() {
        return side1;
    }

    double getSide2() {
        return side2;
    }

    double area() {
        double ar;
        ar = side1 * side2;
        return ar;
    }

    double perimeter() {
        double peri;
        peri = 2 * (side1 + side2);
        return peri;
    }
}