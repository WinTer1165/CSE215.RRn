import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestMain {

    // checking duplicate account and negative balance
    public static void checkAccount(String current, String newAccount, double balance)
            throws DuplicateAccountException {
        if (current.hashCode() == newAccount.hashCode()) {
            throw new DuplicateAccountException("Duplicate Account Found!!!");
        }
        if (balance < 0) {
            throw new DuplicateAccountException("Poor!!! Negative balance");
        }
    }

    // bonus part
    public static void checkCapital(String firstName, String lastName) throws CapitalException {
        for (Character letter : firstName.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                throw new CapitalException("Capital letter found!!!");
            }
        }
        for (Character letter : lastName.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                throw new CapitalException("Capital letter found!!!");
            }
        }
    }

    // writing to file
    public static void WriteToFile(File f, String content) throws IOException {
        FileWriter fw = new FileWriter(f, true);
        fw.write(content + "\n");
        fw.close();
    }

    // bonus part
    public static void ReadFile(File f) throws IOException {
        Scanner rf = new Scanner(f);
        while (rf.hasNext()) {
            String AccountNo = rf.next();
            String firstName = rf.next();
            String lastName = rf.next();
            double balance = rf.nextDouble();
            try {
                checkCapital(firstName, lastName);
            } catch (CapitalException e) {
                e.printStackTrace();
            }
        }
        rf.close();
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        // test data
        // int n = 4;
        System.out.printf("Enter number of accounts: ");
        int n = sc.nextInt();

        Account[] arr = new Account[n];

        // test data
        // arr[0] = new Account("123454", new Name("Cats", "Gang"), 500);
        // arr[1] = new Account("123499999", new Name("Ultimate", "Cat"), 320);
        // arr[2] = new Account("118877", new Name("Cat", "Meow"), 400);
        // arr[3] = new Account("999999", new Name("Lord", "Kitty"), 4100);

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Account No: ");
            String accountNo = sc.next();
            System.out.printf("Enter First Name: ");
            String firstName = sc.next();
            System.out.printf("Enter Last Name: ");
            String lastName = sc.next();
            System.out.printf("Enter Balance: ");
            double balance = sc.nextDouble();
            arr[i] = new Account(accountNo, new Name(firstName, lastName), balance);
        }
        sc.close();
        
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].toString());
        }

        String fileName = "AccountRecords.txt";

        File f = new File(fileName);

        for (int i = 0; i < n; i++) {
            try {
                Scanner in = new Scanner(f);
                while (in.hasNext()) {
                    String AccountNo = in.next();
                    String firstName = in.next();
                    String lastName = in.next();
                    double balance = in.nextDouble();
                    checkAccount(AccountNo, arr[i].getAccountNo(), arr[i].getBalance());
                }
                in.close();
                WriteToFile(f, arr[i].toString());
            } catch (DuplicateAccountException e) {
                e.printStackTrace();
            }
        }
        // bonus part
        ReadFile(f);
    }

}
