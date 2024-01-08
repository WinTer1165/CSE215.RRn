public class Triangle {

    public static void checkSides(int a, int b, int c) throws IllegalTriangleException {
        if ((a + b < c) || (b + c < a) || (c + a < b)) {
            throw new IllegalTriangleException("Sum of any two sides is not greater than the third side!!!");
        }
    }

    public static void main(String[] args) {
        int side1 = 1, side2 = 3, side3 = 5;

        try {
            checkSides(side1, side2, side3);
            System.out.println("It is a Triangle!!!");
        } catch (IllegalTriangleException e) {
            System.out.println("It is not a Triangle!!!");
            e.printStackTrace();
        }
    }
}
