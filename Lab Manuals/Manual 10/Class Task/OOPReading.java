import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class OOPReading {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        File f = new File("StudentRecords.txt");
        Scanner in = new Scanner(f);

        String seniorStudent = "";
        int maxAge = 0;
        double maxCGPA = 0.0;
        String highestName = "";

        System.out.print("Enter an age to search: ");
        int searchAge = sc.nextInt();
        int age_count = 0;

        while (in.hasNext()) {
            String name = in.next();
            int age = in.nextInt();
            String id = in.next();
            Double cg = in.nextDouble();

            if (age > maxAge) {
                maxAge = age;
                seniorStudent = name;
            }
            if (cg > maxCGPA) {
                maxCGPA = cg;
                highestName = name;
            }
            if (age == searchAge) {
                age_count++;
            }
        }

        System.out.println("Task 1: ");
        System.out.println("Senior most student is " + seniorStudent + " with age " + maxAge);
        System.out.println("Task 2: ");
        System.out.println("There are " + age_count + " students with age " + searchAge + ".");
        System.out.println("Task 3: ");
        System.out.println("Highest CGPA is " + maxCGPA + "  Student Name: " + highestName);

        in.close();


        String updatedName = "Tanzina";
        double updatedGrade = 3.0;

        File tempFile = new File("temp.txt");
        FileWriter fw = new FileWriter(tempFile);

        in = new Scanner(f);
        while (in.hasNext()) {
            String name = in.next();
            int age = in.nextInt();
            String id = in.next();
            Double cg = in.nextDouble();

            if (name.equals(updatedName)) {
                cg = updatedGrade;
            }
            fw.write(name + " " + age + " " + id + " " + cg + "\n");
        }

        in.close();
        fw.close();
        sc.close();
        f.delete();
        tempFile.renameTo(f);

    }
}
