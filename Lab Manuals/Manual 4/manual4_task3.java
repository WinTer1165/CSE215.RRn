
import java.util.Scanner;

public class manual4_task3 {

    static int second_last_vowel(String sentence) {

        char[] sentenceArray = sentence.toCharArray();
        int stringLength = sentenceArray.length;

        int counter = 0;
        for (int i = 0; i < stringLength; i++) {
            if (sentenceArray[i] == 'a' || sentenceArray[i] == 'A' || sentenceArray[i] == 'e'
                    || sentenceArray[i] == 'E'
                    || sentenceArray[i] == 'i' || sentenceArray[i] == 'I'
                    || sentenceArray[i] == 'o'
                    || sentenceArray[i] == 'O' || sentenceArray[i] == 'u'
                    || sentenceArray[i] == 'U') {
                counter++;
            }
        }
        int second_counter = 0;
        for (int i = 0; i < stringLength; i++) {
            if (sentenceArray[i] == 'a' || sentenceArray[i] == 'A' || sentenceArray[i] == 'e'
                    || sentenceArray[i] == 'E'
                    || sentenceArray[i] == 'i' || sentenceArray[i] == 'I'
                    || sentenceArray[i] == 'o'
                    || sentenceArray[i] == 'O' || sentenceArray[i] == 'u'
                    || sentenceArray[i] == 'U') {
                second_counter++;
                if (second_counter == counter - 1) {
                    System.out.println("2nd last vowel is " + sentenceArray[i] + " indexed at " + i);
                    return i;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        int returned_index = second_last_vowel(sentence);

        second_last_vowel(sentence);
        System.out.println("Returned index: " + returned_index);
        input.close();

    }
}