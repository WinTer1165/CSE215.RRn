abstract class Figure {
    public Figure() {
        System.out.println("Inside Figure");
    }

    public abstract void printOnScreen();
}

class Rectangle extends Figure {
    public Rectangle() {
        System.out.println("Inside Rectangle Constructor");

    }

    public void printOnScreen() {
        System.out.println("Inside printOnScreen() method of Rectangle class");
    }
}

public class oop10 {
    public static void main(String[] args) {
        Figure fig = new Rectangle();
        fig.printOnScreen();
    }
}
