import java.util.Scanner;

public class Q4 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] customSplit(String str) {
        int len = findLength(str);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int[] spaceIndex = new int[spaceCount + 2];
        spaceIndex[0] = -1;
        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[idx] = len;
        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            int start = spaceIndex[i] + 1;
            int end = spaceIndex[i + 1];
            String word = "";
            for (int j = start; j < end; j++) {
                word += str.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    public static String[][] wordWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] table) {
        int minIndex = 0, maxIndex = 0;
        int minLen = Integer.valueOf(table[0][1]);
        int maxLen = Integer.valueOf(table[0][1]);
        for (int i = 1; i < table.length; i++) {
            int len = Integer.valueOf(table[i][1]);
            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] table = wordWithLengths(words);
        int[] result = findShortestAndLongest(table);

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.valueOf(table[i][1]));
        }

        System.out.println("\nShortest word: " + table[result[0]][0] + " (Length: " + table[result[0]][1] + ")");
        System.out.println("Longest word: " + table[result[1]][0] + " (Length: " + table[result[1]][1] + ")");

        sc.close();
    }
}
