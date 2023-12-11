import java.util.Scanner;

public class vowel_remove {
    public static final int SIZE = 100;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String without_a = sentence.replace("a", "");
        String without_A = without_a.replace("A", "");
        String without_e = without_A.replace("e", "");
        String without_E = without_e.replace("E", "");
        String without_i = without_E.replace("i", "");
        String without_I = without_i.replace("I", "");
        String without_o = without_I.replace("o", "");
        String without_O = without_o.replace("O", "");
        String without_u = without_O.replace("u", "");
        String without_U = without_u.replace("U", "");

        System.out.println("After removing vowels: "+ without_U);
        
        input.close();
    }
}