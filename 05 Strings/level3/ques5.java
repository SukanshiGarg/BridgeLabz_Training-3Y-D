import java.util.Scanner;

public class ques5 {

    public static char[] uniqueCharacters(String str) {
        int len = str.length();
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

    public static String[][] charFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        char[] unique = uniqueCharacters(str);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = Character.toString(unique[i]);
            result[i][1] = Integer.toString(freq[unique[i]]);
        }

        return result;
    }

    public static void displayFrequency(String[][] data) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-10s%n", data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freqResult = charFrequency(input);
        displayFrequency(freqResult);

        sc.close();
    }
}
