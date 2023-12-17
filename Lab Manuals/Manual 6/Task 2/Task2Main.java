
public class Task2Main {
    public static void main(String[] args) {
        TaskFraction myFraction01 = new TaskFraction(17, 20);
        System.out.println(myFraction01.getNumerator());
        System.out.println(myFraction01.getDenominator());
        TaskFraction myFraction02 = new TaskFraction();
        myFraction02.setNumerator(5);
        myFraction02.setDenominator(20);
        myFraction01.add(myFraction02);
        myFraction01.sub(myFraction02);
        myFraction01.multiplication(myFraction02);
        myFraction01.division(myFraction02);
        System.out.println(myFraction01.toString());
        System.out.println(myFraction02.toString());

    }
}
