public class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation() {

    }

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double FindDiscriminant() {

        double discriminant = (b * b) - (4 * a * c);
        if (discriminant == 0) {
            return discriminant;
        } else if (discriminant > 0) {
            return discriminant;
        } else {
            return discriminant;
        }

    }

    public double[] FindRoots() {
        double roots[] = new double[2];
        roots[0] = (-b + Math.sqrt(FindDiscriminant())) / (2 * a);
        roots[1] = (-b - Math.sqrt(FindDiscriminant())) / (2 * a);
        return roots;
    }

    public double SumOfDiscriminants(QuadraticEquation[] Qarray) {
        double sum = 0;

        for (QuadraticEquation quadraticEquation : Qarray) {
            sum += quadraticEquation.FindDiscriminant();
        }
        return sum;
    }

    public String toString() {

        return "\na = " + a + "  b = " + b + "  c = " + c + "\n" + "Discriminant = " + FindDiscriminant() + "\n"
                + "Roots = "
                + FindRoots()[0] + ", " + FindRoots()[1];
    }
}
