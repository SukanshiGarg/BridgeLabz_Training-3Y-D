import java.util.*;
public class q2_youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height of " + names[i] + ":");
            ages[i] = sc.nextInt();
            heights[i] = sc.nextInt();
        }

        // find youngest
        int minAge = ages[0];
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }

        // find tallest
        int maxHeight = heights[0];
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }

        // display
        System.out.println("Youngest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + ")");
        
        sc.close();
    }
}
