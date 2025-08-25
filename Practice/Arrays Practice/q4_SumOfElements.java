import java.util.*;
public class q4_SumOfElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int num:arr){
            sum+=num;
        }

        System.out.println("The sum of all the elements in an arrays is "+ sum);
        


    }
   
}
