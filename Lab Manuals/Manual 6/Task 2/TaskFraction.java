public class TaskFraction {
    float numerator;
    float denominator;

    TaskFraction() {
        numerator = 0;
        denominator = 0;
    }

    TaskFraction(float x, float y) {
        this.numerator = x;
        this.denominator = y;
    }

    int getNumerator() {
        return (int) numerator;
    }

    int getDenominator() {
        return (int) denominator;
    }

    void setNumerator(int num) {
        this.numerator = num;
    }

    void setDenominator(int den) {
        this.denominator = den;
    }

    void add(TaskFraction replica) {
        float sum = (replica.numerator/replica.denominator)+(numerator/denominator);
        System.out.println("SUM: " + sum);
    }

    void sub(TaskFraction replica) {
        float diff = (numerator/denominator)-(replica.numerator/replica.denominator);
        System.out.println("DIFF: " + diff);
    }

    void multiplication(TaskFraction replica) {
        float mul = (numerator/denominator)*(replica.numerator/replica.denominator);
        System.out.println("PROD: " + mul);
    }

    void division(TaskFraction replica) {
        float quo = (numerator/denominator)/(replica.numerator/replica.denominator);
        System.out.println("QUO: " + quo);
    }

    public String toString() {
        String converted_string = Integer.toString((int)numerator) + "/"+ Integer.toString((int)denominator);
        return converted_string;
    }
}
