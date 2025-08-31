public class Ques2 extends NumberChecker {
    public static void main(String[] args) {
        int num = 153; 

        System.out.println("Number: " + num);
        System.out.println("Digits Count: " + countDigits(num));
        int[] digits = getDigits(num);
        System.out.print("Digits Array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Is Duck Number? " + isDuck(num));
        System.out.println("Is Armstrong Number? " + isArmstrong(num));
        findTwoLargest(digits);
        findTwoSmallest(digits);
    }
}
