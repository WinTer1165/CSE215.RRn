public class TaskPoint {
    int x;
    int y;

    TaskPoint() {
        x = 0;
        y = 0;
    }

    TaskPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "X:" + x + "   Y:" + y;
    }

    double distance(TaskPoint replica) {
        return Math.sqrt((x - replica.x) * (x - replica.x) + (y - replica.y)
                * (y - replica.y));
    }
}
