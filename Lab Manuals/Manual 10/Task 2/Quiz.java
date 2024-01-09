public class Quiz {
    private String id;
    private int marks;

    Quiz() {}

    Quiz(String id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }
    public int getMarks() {
        return marks;
    }
    public String toString() {
        return "ID: " + id + "  Marks: " + marks;
    }
}
