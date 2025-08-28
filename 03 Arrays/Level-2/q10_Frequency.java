import java.util.*;
public class q10_Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int freq[]= new int[10];

        int temp=n;
        while(temp>0){
            int digit = temp%10;
            freq[digit]++;
            temp=temp/10;
        }
       
         System.out.println("Digit frequencies:");
         for(int i=0;i<10;i++){
            System.out.println(i+" --> "+ freq[i]);
         }

         sc.close();
    }
}
