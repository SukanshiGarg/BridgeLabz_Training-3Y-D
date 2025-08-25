import java.util.*;
public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int c=0;
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j:arr){
            if(j==target){
               c++;
            }
        }
        System.out.println("The target number"+n+"occurs"+c+"times");
    }
}
