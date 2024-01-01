public class Main2 {
    public static void main(String[] args) {
        Square obj = new Square(5, 5, "Square");
        System.out.println("Area of " + obj.getName() + " : " + obj.area());
        System.out.println("Perimeter of " + obj.getName() + " : " + obj.perimeter());
        Square obj1 = new Square(5, 7, "Rectangle");
        System.out.println("Area of " + obj1.getName() + " : " + obj1.area());
        System.out.println("Perimeter of " + obj1.getName() + " : " + obj1.perimeter());
    }
}