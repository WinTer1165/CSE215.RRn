import java.util.Scanner;

public class palindrome_string {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        char[] sentenceArray = sentence.toCharArray();
        int stringLength = sentenceArray.length;
        char reverseArray[] = new char[stringLength];

        int reverse_index = stringLength-1;
        for (int i = 0; i < stringLength; i++) {
            reverseArray[i] = sentenceArray[reverse_index];
            reverse_index--;
        }
        

        String reversed_sentence = new String(reverseArray);
        System.out.println("Hash value of original sentence is "+ sentence.hashCode() + " Sentence: "+sentence);
        System.out.println("Hash value of reversed sentence is "+ reversed_sentence.hashCode()+" Sentence: "+reversed_sentence);
        if (sentence.hashCode() == reversed_sentence.hashCode()) {
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("Not Palindrome!");
        }
        
        input.close();
    }
}