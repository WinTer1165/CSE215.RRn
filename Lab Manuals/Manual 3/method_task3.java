import java.util.Scanner;

public class method_task3 {
    public static double balance = 0;

    public static double deposit(double money) {
        balance += money;
        return balance;
    }

    public static double withdraw(double money) {
        if (balance > money) {
            balance -= money;
            System.out.print("Money withdrawn successfully!!!\n");
            return balance;
        } else {
            System.out.print("You are poor, can't withdraw!!!\n");
            return balance;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.print("Welcome to ABC Bank!\n");
            System.out.print("1. Deposit\n");
            System.out.print("2. Withdraw\n");
            System.out.print("3. Balance\n");
            System.out.print("4. Exit\n");
            System.out.print("Choose a option: ");
            int user_choice = input.nextInt();
            double money;
            switch (user_choice) {
                case 1:
                    System.out.print("How much money you want to deposit? ");
                    money = input.nextDouble();
                    deposit(money);
                    System.out.print("Money deposited successfully!!!\n");
                    break;
                case 2:
                    System.out.print("How much money you want to withdraw? ");
                    money = input.nextDouble();
                    withdraw(money);
                    break;
                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;
                case 4:
                    System.out.println("Code successfully closed!\n");
                    keepGoing = false;
                    break;
                default:
                    System.out.print("Invalid option!!!");
                    break;
            }

        }
        input.close();
    }
}