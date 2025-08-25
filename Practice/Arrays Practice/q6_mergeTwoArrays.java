import java.util.*;
public class q6_mergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int arr1[] = new int[n];
        int arr2[]=new int[m];
        
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int j=0;j<arr2.length;j++){
            arr2[j]=sc.nextInt();
        }
        
        int arr3[]= new int[n+m];
        for(int k=0;k<arr1.length;k++){
            arr3[k]=arr1[k];
        }

        for(int s=0;s<arr2.length;s++){
            arr3[n]=arr2[s];
            n++;
        }

        for(int num:arr3){
            System.out.print(num+" ");
        }

        
        
    }
}
