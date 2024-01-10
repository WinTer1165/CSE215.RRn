import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("How many equations you calculating?");
        int n = sc.nextInt();

        double a, b, c;
        QuadraticEquation[] arr = new QuadraticEquation[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter value for a[%d]: ", i + 1);
            a = sc.nextDouble();
            System.out.printf("Enter value for b[%d]: ", i + 1);
            b = sc.nextDouble();
            System.out.printf("Enter value for c[%d]: ", i + 1);
            c = sc.nextDouble();
            System.out.printf("\n");
            arr[i] = new QuadraticEquation(a, b, c);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].toString());
        }

        System.out.println("\nSUM of Discriminant: " + arr[0].SumOfDiscriminants(arr));
        sc.close();
    }
}
