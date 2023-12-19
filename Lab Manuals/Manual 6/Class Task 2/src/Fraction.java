public class Fraction {
    private float numerator;
    private float denominator;

    Fraction() {
        numerator = 0;
        denominator = 0;
    }

    Fraction(float x, float y) {
        this.numerator = x;
        this.denominator = y;
    }

    public int getNumerator() {
        return (int) numerator;
    }

    public int getDenominator() {
        return (int) denominator;
    }

    public void setNumerator(int num) {
        this.numerator = num;
    }

    public void setDenominator(int den) {
        this.denominator = den;
    }

    public void add(Fraction replica) {
        //float sum = (replica.numerator/replica.denominator)+(numerator/denominator);

        float upper = numerator*replica.denominator + replica.numerator*denominator;
        float lower = denominator * replica.denominator;
        System.out.println("Sum: " + (int)upper + "/" + (int) lower);
    }

    public void sub(Fraction replica) {
        //float diff = (numerator/denominator)-(replica.numerator/replica.denominator);
        float upper = numerator*replica.denominator - replica.numerator*denominator;
        float lower = denominator * replica.denominator;
        System.out.println("Difference: " + (int)upper + "/" + (int) lower);
    }

    public void multiplication(Fraction replica) {
        //float mul = (numerator/denominator)*(replica.numerator/replica.denominator);
        float upper = numerator * replica.numerator;
        float lower = denominator * replica.denominator;
        System.out.println("Product: " + (int)upper + "/" + (int) lower);
    }

    public void division(Fraction replica) {
        //float quo = (numerator/denominator)/(replica.numerator/replica.denominator);
        float upper = numerator * replica.denominator;
        float lower = denominator * replica.numerator;
        System.out.println("Quotient: " + (int)upper + "/" + (int) lower);
    }

    public String toString() {
        String converted_string = Integer.toString((int)numerator) + "/"+ Integer.toString((int)denominator);
        return converted_string;
    }
}
