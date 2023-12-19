public class Line {
    private Point start;
    private Point end;

    Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    Line(Point start, Point end) {
        this.start = start; //new Point(start.getX(), start.getY());
        this.end = end;     //new Point(end.getX(), end.getY());

    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double length() {

        double dis = start.distance(end);
        System.out.println(dis);
        return Math.sqrt((start.getX() - end.getX()) * (start.getX() - end.getX()) + (start.getY() - end.getY())
                * (start.getY() - end.getY()));
    }
}
