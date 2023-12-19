public class Main {
    public static void main(String[] args) {

        Point myPointStart = new Point(3, 2);
        Point myPointEnd = new Point(7, 8);
        Line myLine = new Line(myPointStart, myPointEnd);

        System.out.println("Distance: " + myLine.length());
        System.out.println("Distance Version 2: " + myPointStart.distance(myPointEnd));

        Line myLineV2 = new Line(2, -6, 7, 3);
        System.out.println("Distance: " + myLineV2.length());
    }
}
