import java.util.Scanner;

public class ques7 {

    // Logic 1: Iterative start-end comparison
    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Logic 3: Using char array and reversed array
    public static boolean isPalindromeCharArray(String str) {
        char[] original = str.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = str.charAt(original.length - 1 - i);
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        boolean result1 = isPalindromeIterative(input);
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean result3 = isPalindromeCharArray(input);

        System.out.println("Palindrome check using iterative method: " + result1);
        System.out.println("Palindrome check using recursive method: " + result2);
        System.out.println("Palindrome check using char array method: " + result3);

        sc.close();
    }
}
