import java.util.Scanner;

public class string_reverse {

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

        sentence = new String(reverseArray);
        System.out.println(sentence);
        input.close();
    }
}