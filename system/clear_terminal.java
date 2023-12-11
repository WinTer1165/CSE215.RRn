import java.io.IOException;

class clear_terminal {

 public static void main(String[] args) throws IOException, InterruptedException {
    System.out.println("Hello World!");

    //Doesn't need anything
    // The first four characters \033 means ESC or the escape character. 
    // Combining 033 with [H, we can move the cursor to a specified position. 
    // The last characters, 033[2J, cleans the whole screen.

    // System.out.print("\033[H\033[2J");
    // System.out.flush();
    

    //Another way: requires import java.io.IOException;
    // and throws IOException, InterruptedException
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();


    System.out.println("Hello Meow!");
 } 
}