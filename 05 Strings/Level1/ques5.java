
import java.util.*;

public class ques5 {

    public static void generateException(String text) {
        System.out.println("Character at index " + text.length() + " is: " + text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Character at index " + text.length() + " is: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Invalid index access!");
        } finally {
            System.out.println("Finally block executed: End of handling.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        handleException(input);

        sc.close();
    }
}