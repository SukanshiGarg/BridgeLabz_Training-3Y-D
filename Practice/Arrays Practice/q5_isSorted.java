import java.util.*;
public class q5_isSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean ans= isSorted(arr);
        System.err.println(ans);
    }

     static boolean isSorted(int arr[]){
        for(int i=0;i < arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
           
        }
         return true;
    }
}
