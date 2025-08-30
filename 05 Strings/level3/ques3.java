import java.util.Scanner;

public class ques3 {

    public static char firstNonRepeatingChar(String str) {
        int[] freq = new int[256]; // ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = firstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
