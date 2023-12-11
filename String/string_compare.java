import java.util.Scanner;
public class string_compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        String c  = input.nextLine();
        if (a.hashCode()==b.hashCode()) {
            System.out.println("A and B are Equal String");
        }
        System.out.println("Hash Code value of a is "+ a.hashCode());
        System.out.println("Hash Code value of b is "+ b.hashCode());
        System.out.println("Hash Code value of c is "+ c.hashCode());
        input.close();
    }
}