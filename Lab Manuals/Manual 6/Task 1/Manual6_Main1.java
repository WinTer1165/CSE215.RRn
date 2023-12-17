public class Manual6_Main1 {

    public static void main(String[] args) {

        TaskPoint myPointStart = new TaskPoint(3, 2);
        TaskPoint myPointEnd = new TaskPoint(7, 8);
        TaskLine myLine = new TaskLine(myPointStart, myPointEnd);
        System.out.println("Distance: " + myLine.length());
        System.out.println("Distance Version 2: " + myPointStart.distance(myPointEnd));

        TaskLine myLineV2 = new TaskLine(2, -6, 7, 3);
        System.out.println("Distance: " + myLineV2.length());
    }

}