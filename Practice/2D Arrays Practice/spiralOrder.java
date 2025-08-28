import java.util.*;

public class spiralOrder {
    public static void main(String[] args) {
        spiralOrder obj = new spiralOrder();
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12}
        };

        System.out.println(obj.spiralOrder(matrix));
    }

    public List<Integer> spiralOrder(int [][]matrix){
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0, bottom = m-1;
        int left = 0, right = n-1;
        
        while(top <= bottom && left <= right){
            // 1. Left → Right
            for(int j = left; j <= right; j++){
                ans.add(matrix[top][j]);
            }
            top++;

            // 2. Top → Bottom
            for(int i = top; i <= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            // 3. Right → Left
            if(top <= bottom){
                for(int j = right; j >= left; j--){  
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // 4. Bottom → Top
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
