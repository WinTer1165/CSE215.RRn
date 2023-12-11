import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your weight, then height: ");
        float weight = input.nextFloat(), height = input.nextFloat(), bmi = (weight/(height*height))*10000;
        input.close();
        if (bmi<18.5){
            System.out.println("Underweight, BMI: "+bmi);
        }
        else if (bmi>18.5 && 24.9>=bmi){
            System.out.println("Healthy, BMI: "+bmi);
        }
        else if (bmi>24.9 && bmi<29.9){
            System.out.println("Overweight, BMI: "+bmi);
        }
        else if (bmi>29.9){
            System.out.println("Obese, BMI: "+bmi);
        }
        else {
            System.out.println("BMI Invalid");
        }

    }
}
