import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("First Object: ");
        Circle myCircle2 = new Circle();

        System.out.print("Enter radius of the circle: ");
        myCircle2.radius = input.nextFloat();
        myCircle2.Area();
        myCircle2.Perimeter();
        input.nextLine();
        System.out.print("Enter color for your circle: ");
        myCircle2.color = input.nextLine();
        myCircle2.Color();


        System.out.println("Second Object: ");
        Circle myCircle1 = new Circle( 10, "yellow");

        //myCircle1.Area();
        //myCircle1.Perimeter();
        //myCircle1.Color();

        double area = myCircle1.Area(), perimeter=myCircle1.Perimeter();
        String color = myCircle1.Color();
        System.out.println("Area: "+ area + "  Perimeter: " +perimeter + "  Color: "+ color);


        input.close();
    }
}