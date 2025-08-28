import java.util.*;
public class q3_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // count digits
        int temp = n;
        int count = 0;
        if (temp == 0) count = 1;
        else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        // store digits in array
        int arr[] = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;

    }

    int largestDigit = largest(arr);
        int secondLargestDigit = secondL(arr);

        System.out.println("Largest digit: " + largestDigit);
        if (secondLargestDigit == Integer.MIN_VALUE) {
            System.out.println("No second largest digit (all digits are same)");
        } else {
            System.out.println("Second largest digit: " + secondLargestDigit);
        }
}

    public static int largest(int num[]){
        int maxN=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
          if(num[i]>maxN){
            maxN=num[i];
          }
        }
        return maxN;
    }

    public static int secondL(int num[]){
        int second=Integer.MIN_VALUE;
        int first=Integer.MIN_VALUE;
        for(int n:num){
          if(n>first){
            second=first;
            first=n;
          }
          else if(n> second && n!=first){
            second=n;
          }
        }
        return second;
    }
}
