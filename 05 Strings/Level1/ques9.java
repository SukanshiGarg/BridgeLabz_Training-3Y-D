
import java.util.*;

public class ques9 {

    public static void generateException(String[] names) {
        System.out.println("Accessing element: " + names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing element: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid array index access.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed: End of handling.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        handleException(names);
        sc.close();
    }
}