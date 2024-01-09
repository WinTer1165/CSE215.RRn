import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizTest {
    public static void main(String[] args) {
        int size = 4;
        Quiz[] student = new Quiz[size];
        int i = 0;
        try {
            File myObj = new File("quiz.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()) {
                String id = myReader.next();
                int mark = myReader.nextInt();
                student[i] = new Quiz(id, mark);
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int max = student[0].getMarks(), temp_index = 0;
        for (int j = 0; j < student.length; j++) {
            if (max < student[j].getMarks()) {
                max = student[j].getMarks();
                temp_index = j;
            }
        }
        System.out.println("Max student with ID & Marks: \n" + student[temp_index].toString());

        System.out.println("Program Output: ");
        for (int k = 0; k < student.length; k++) {
            System.out.println(student[k].toString());
        }

        System.out.println("Highest mark obtained by ID: " + student[temp_index].getId());
    }
}
