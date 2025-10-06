package linear_search;
import java.util.*;
public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 45, 67},
            {34, -56},
            {-62, 99, 101, -120}
        };

        int target = 23;
        int[] ans = search2D(arr, target); 
        System.out.println(Arrays.toString(ans));

        System.out.println(maxNum(arr, arr[0][0]));
        
        
    }

    static int[] search2D(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] {i, j}; 
                }
            }
        }
        return new int[] {-1, -1};
    }

    static int maxNum(int[][] arr, int maxN) {
         
        for (int[] a : arr) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] > maxN) {
                    maxN = a[j];
                }
            }
        }
        return maxN;
    }
}
