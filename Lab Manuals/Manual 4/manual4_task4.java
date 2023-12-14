import java.util.Scanner;

public class manual4_task4 {

    // static int countVowels(String sentence) {
    // char[] sentence = sentence.toCharArray();
    // int stringLength = sentence.length;

    // int counter = 0;

    // for (int i = 0; i < stringLength; i++) {
    // if (sentence[i] == 'a' || sentence[i] == 'A' || sentence[i] == 'e' ||
    // sentence[i] == 'E'
    // || sentence[i] == 'i' || sentence[i] == 'I' || sentence[i] == 'o'
    // || sentence[i] == 'O' || sentence[i] == 'u' || sentence[i] == 'U') {
    // counter++;
    // System.out.println(sentence[i] + " positioned at " + i + " index.");
    // }
    // }
    // return counter;
    // }

    static int countVowels(String sentence) {

        int stringLength = sentence.length();
        String sentence2 = sentence.toLowerCase();
        int counter = 0;
        for (int i = 0; i < stringLength; i++) {
            if (sentence2.charAt(i) == 'a' || sentence2.charAt(i) == 'e' || sentence2.charAt(i) == 'i'
                    || sentence2.charAt(i) == 'o' || sentence2.charAt(i) == 'u') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        int vowel_no = countVowels(sentence);
        System.out.println("Total Vowels: " + vowel_no);
        input.close();
    }
}