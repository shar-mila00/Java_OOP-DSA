package linear_search;
import java.util.*;
public class StringSearch {
    public static void main(String[] args) {
        String str = "sharmila";
        char target = ' ';
        System.out.println(Arrays.toString(str.toCharArray())); // convert to array and then convert to string

        System.out.println(stringLinSearch(str, target));
    }

    static boolean stringLinSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        
        // convert the string into an array
        for (char c : str.toCharArray()) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}
