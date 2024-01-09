import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {

    public static void main(String[] args) {

        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            }
        } catch (IOException e) {
            System.out.println("Doesn't exist");
            e.printStackTrace();
        }

        Scanner input = new Scanner(System.in);
        int i = 1, num;
        boolean KeepGoing = true;
        while (KeepGoing) {
            try (FileWriter myWriter = new FileWriter("filename.txt");) {
                while (KeepGoing) {
                    System.out.printf("Enter %d term: ", i);
                    num = input.nextInt();
                    if (num < 0) {
                        System.out.println("Number is negative integer!!!");
                        KeepGoing = false;
                    } else {
                        myWriter.write(num + "\n");
                        i++;
                    }
                }
                myWriter.close();
                System.out.println("Code Ended and successfully written to the file.");
            } catch (IOException e) {
                e.printStackTrace();
            }
            i++;
        }

        int sum = 0;
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextInt()) {
                Integer data = myReader.nextInt();
                sum += data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        System.out.println("SUM: " + sum);

        input.close();
    }
}