import java.util.Scanner;

public class string_to_char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        char[] nameArray = name.toCharArray();
        for (char Letter : nameArray) {
            System.out.println(Letter);
        }
        input.close();
    }
}