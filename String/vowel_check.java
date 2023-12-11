import java.util.Scanner;

public class vowel_check {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        char[] sentenceArray = sentence.toCharArray();
        int stringLength = sentenceArray.length;

        for (int i = 0; i < stringLength; i++) {
            if (sentenceArray[i] == 'a' || sentenceArray[i] == 'A' || sentenceArray[i] == 'e' || sentenceArray[i] == 'E'
                    || sentenceArray[i] == 'i' || sentenceArray[i] == 'I' || sentenceArray[i] == 'o'
                    || sentenceArray[i] == 'O' || sentenceArray[i] == 'u' || sentenceArray[i] == 'U') {
                System.out.println(sentenceArray[i] + " positioned at " + i + " index.");
            }
        }
        input.close();
    }
}