public class Ques5 extends NumberChecker {
    public static void main(String[] args) {
        int num = 7; // Example number

        System.out.println("Number: " + num);
        System.out.println("Is Prime? " + isPrime(num));
        System.out.println("Is Neon Number? " + isNeon(num));
        System.out.println("Is Spy Number? " + isSpy(num));
        System.out.println("Is Automorphic Number? " + isAutomorphic(num));
        System.out.println("Is Buzz Number? " + isBuzz(num));
    }
}
