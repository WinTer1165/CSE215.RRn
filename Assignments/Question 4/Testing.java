import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) throws IOException {

        File f = new File("BookRecords.txt");
        Scanner fr = new Scanner(f);

        int most_sold = 0;
        String most_sold_bookName = "";
        int no_of_lines = 0;

        while (fr.hasNext()) {
            String bookName = fr.next();
            String writerName = fr.next();
            String publisherName = fr.next();
            double price = fr.nextDouble();
            int sold = fr.nextInt();

            if (most_sold < sold) {
                most_sold = sold;
                most_sold_bookName = bookName;
            }
            no_of_lines++; // counting no of lines in file

        }

        // most sold or popular book with writer name
        System.out.println("Most Popular Book: " + most_sold_bookName + ", " + most_sold + " copies sold.");
        fr.close();

        fr = new Scanner(f);
        Writer writer[] = new Writer[no_of_lines];
        int i = 0;
        while (fr.hasNext()) {
            String bookName = fr.next();
            String writerName = fr.next();
            String publisherName = fr.next();
            double price = fr.nextDouble();
            int sold = fr.nextInt();
            writer[i] = new Writer(writerName, price, sold);
            i++;
        }
        fr.close();

        String w = "Ayon"; // used for testing
        // finding total earning of a writer
        for (int j = 0; j < no_of_lines; j++) {
            if (writer[j].getWriterName().equals(w)) {
                writer[j].TotalEarning(writer);
                break;
            }
        }

        // finding no of unique writers
        int count = 0;
        for (int j = 0; j < no_of_lines; j++) {
            boolean isUnique = true;
            for (int k = 0; k < j; k++) {
                if (writer[j].getWriterName().equals(writer[k].getWriterName())) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                count++;
            }

        }
        System.out.println("\nUnique Writer: " + count);
    }
}
