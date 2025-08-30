

import java.util.Scanner;

public class ques6 {

    public static void generateException(String text) {
        System.out.println("Substring: " + text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
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
