public class Main {
    public static void main(String[] args) {

        Fraction myFraction01 = new Fraction(1, 4);
        System.out.println(myFraction01.getNumerator());
        System.out.println(myFraction01.getDenominator());

        Fraction myFraction02 = new Fraction();
        myFraction02.setNumerator(3);
        myFraction02.setDenominator(5);

        myFraction01.add(myFraction02);
        myFraction01.sub(myFraction02);
        myFraction01.multiplication(myFraction02);
        myFraction01.division(myFraction02);

        System.out.println(myFraction01.toString());
        System.out.println(myFraction02.toString());

    }


}