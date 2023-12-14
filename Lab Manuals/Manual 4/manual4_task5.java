import java.util.Scanner;

public class manual4_task5 {

    static int isPalindrome(String sentence) {

        char[] sentenceArray = sentence.toCharArray();
        int stringLength = sentenceArray.length;
        char reverseArray[] = new char[stringLength];

        int reverse_index = stringLength - 1;
        for (int i = 0; i < stringLength; i++) {
            reverseArray[i] = sentenceArray[reverse_index];
            reverse_index--;
        }

        String reversed_sentence = new String(reverseArray);
        System.out.println("Hash value of original sentence is " + sentence.hashCode() + " Sentence: " + sentence);
        System.out.println("Hash value of reversed sentence is " + reversed_sentence.hashCode() + " Sentence: "
                + reversed_sentence);
        if (sentence.hashCode() == reversed_sentence.hashCode()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a sentence: ");
        String sentence = input.nextLine();
        int returned_value = isPalindrome(sentence);
        if (returned_value == 1) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not Palindrome!");
        }
        input.close();
    }
}