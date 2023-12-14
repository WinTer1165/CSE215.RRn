
public class manual4_task2 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "app";
        String str3 = "pe";

        if (str1.startsWith(str2) == true) {
            System.out.println("The " + str1 + " starts with " + str2);

        } else {
            System.out.println("The " + str1 + " does not start with " + str2);
        }

        if (str1.endsWith(str3) == true) {
            System.out.println("The " + str1 + " does ends with " + str3);

        } else {
            System.out.println("The " + str1 + " does not end with " + str3);
        }

    }
}
