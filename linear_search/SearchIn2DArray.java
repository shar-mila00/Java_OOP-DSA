package linear_search;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 45, 67},
            {34, -56},
            {-62, 99, 101, -120}
        };

        int target = 23;

        int[][] arr1 = {
            {},
            {},
        };
        System.out.println(arr1.length);
        
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
}
