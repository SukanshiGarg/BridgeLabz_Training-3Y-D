import java.util.Scanner;

public class ques2 {

    public static int stringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Reached end of string
        }
        return count;
    }

    public static char[] findUniqueChars(String str) {
        int len = stringLength(str);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] unique = findUniqueChars(input);

        System.out.print("Unique characters: ");
        for (char ch : unique) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}
