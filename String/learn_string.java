public class learn_string {
    public static void main(String[] args) {

        String name = "Md Aminul ";
        System.out.println(name);
        // concat() method appends the string at the end
        name = name.concat("Islam ");
        System.out.println(name);
        String nickname = new String("Labib");
        name = name.concat(nickname);
        System.out.println(name);

        System.out.println("Length of Name including space: " + name.length());

        System.out.println("Is name and nickname equal? " + name.equals(nickname));

        // Escape character
        String name2 = "          Muin \"Khan\" Mubin123    ";

        System.out.println("Without trimming: " + name2);
        // removes any leading and trailing white spaces
        System.out.println("After trimming: " + name2.trim());
        // checks whether the string contains a substring
        System.out.println("name 2 contains Khan? " + name2.contains("Khan"));

        // returns the substring of the string
        System.out.println("Sub String: " + name.substring(0, 15));

        String name3 = new String("Shafin An Nur");

        // join the given strings using the delimiter
        System.out.println("Both " + String.join(" and ", name2.trim(), name3) + " are stupid.");

        // replaces the specified old character with the specified new character
        System.out.println(name.replace('a', 'i'));

        // replaces all substrings matching the regex pattern
        System.out.println((name2.replaceAll("\\d+", " ")).trim());

        // replace the first matching substring
        System.out.println(name.replaceFirst("i", "a"));

        // returns the character present in the specified location
        System.out.println(name.charAt(10));

        // returns the position of the specified character in the string
        System.out.println(name);
        System.out.println(name.indexOf('a'));

        // compares two strings in the dictionary order
        System.out.println("String Difference: " + name.compareTo(name3));
        
        // breaks the string into an array of strings
        String[] splitted = name.split(" ");
        System.out.print("result = ");
        for (String split : splitted) {
            System.out.print(split + ", ");
        }
        System.out.println();

        // converts the string to lowercase and uppercase
        System.out.println(name.toLowerCase() + name.toUpperCase());

        // checks if the string begins or ends with the given string
        System.out.println("Starts with Md? "+ name.startsWith("Md"));
        System.out.println("Ends with am Labib? "+ name.endsWith("am Labib"));
        System.out.println(name.matches("^M...b$"));

        //hashCode()
        // For two strings to be equal, their hash code also must be equal
        String x = "Hello World!";
        String y = "Hello";
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());

        // returns a subsequence from the string
        System.out.println(x.subSequence(2, 8));
    }
}