package linear_search;
import java.util.*;

public class linSearch1 {
    public static void main(String[] args) {
        int[] nums = {12, 45, 546, 67, 89, 56};
        int target = 657;
        System.out.println(linSearch(nums, target));
    }

    static int linSearch(int[] arr, int target) {
        // enhance loop
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // if not found
    }
}
