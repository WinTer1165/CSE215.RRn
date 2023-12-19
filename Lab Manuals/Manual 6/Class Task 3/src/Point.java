public class Point {
    private int x;
    private int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "X:" + x + "   Y:" + y;
    }

    public double distance(Point replica) {
        return Math.sqrt((x - replica.x) * (x - replica.x) + (y - replica.y)
                * (y - replica.y));
    }
}
