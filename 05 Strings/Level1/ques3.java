
import java.util.*;

public class ques3 {

    public static char[] myToCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] manualArray = myToCharArray(text);

        char[] builtinArray = text.toCharArray();

        boolean result = compareCharArrays(manualArray, builtinArray);

        System.out.print("\nManual char array: ");
        for (char c : manualArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in char array: ");
        for (char c : builtinArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nComparison result: " + result);

        sc.close();
    }
}