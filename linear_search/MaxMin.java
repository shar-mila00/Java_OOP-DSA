package linear_search;
import java.util.*;
public class MaxMin {
    public static void main(String[] args) {
        int[] num = {23, 45, 12, -5, 34, -45, 299};
        System.out.print("The given array: ");
        System.out.println(Arrays.toString(num));

        System.out.println();
        System.out.print("The minimum: ");
        System.out.println(min(num, num[0]));

        System.out.println();
        System.out.print("The maximum: ");
        System.out.println(max(num, num[0]));
    }

    //min
    static int min(int[] arr, int minNum) {
        for (int i : arr) {
            if (i < minNum) {
                minNum = i;
            }
        }
        return minNum;
    }

    //max
    static int max(int[] arr, int maxNum) {
        for (int i : arr) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        return maxNum;
    }
}
