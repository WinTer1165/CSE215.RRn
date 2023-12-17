public class TaskLine {
    TaskPoint start;
    TaskPoint end;

    TaskLine(int x1, int y1, int x2, int y2) {
        this.start = new TaskPoint(x1, y1);
        this.end = new TaskPoint(x2, y2);
    }

    TaskLine(TaskPoint start, TaskPoint end) {
        this.start = new TaskPoint(start.getX(), start.getY());
        this.end = new TaskPoint(end.getX(), end.getY());

    }

    TaskPoint getStart() {
        return start;
    }

    TaskPoint getEnd() {
        return end;
    }

    void setStart(TaskPoint start) {
        this.start = start;
    }

    void setEnd(TaskPoint end) {
        this.end = end;
    }

    double length() {

        return Math.sqrt((start.getX() - end.getX()) * (start.getX() - end.getX()) + (start.getY() - end.getY())
                * (start.getY() - end.getY()));
    }

}
