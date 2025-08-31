public class Ques3 extends NumberChecker {
    public static void main(String[] args) {
        int num = 21; // Example number

        System.out.println("Number: " + num);
        int[] digits = getDigits(num);

        System.out.println("Sum of Digits = " + sumDigits(num));
        System.out.println("Sum of Squares of Digits = " + sumSquareDigits(num));
        System.out.println("Is Harshad Number? " + isHarshad(num));
        digitFrequency(num);
    }
}
