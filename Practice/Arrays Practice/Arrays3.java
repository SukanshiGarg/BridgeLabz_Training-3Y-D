import java.util.*;
public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int arr2[]= new int[n];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }

        for(int num:arr2){
            System.out.println(num+ " ");
        }
        sc.close();
    }
}
