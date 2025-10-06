package linear_search;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(evenN(nums));

    }

    // even or not
    static int evenN(int[] arr) {
        int result = 0;
        for (int num : arr) {
            int digit = digitCount(num);
            if (digit%2 == 0) {
                result++;
            }
        }
        return result;
    }
    
    
    // count the digits of the numbers
    static int digitCount(int n) {
        // negative number
        if (n < 0) {
            n = n*(-1);
        }

        if (n == 0) {
            return 1;
        }
        
        int count = 0;
        while (n > 0) {
            count++;
            n = n/10;
        }
        return count;
    }

    // shortcut : (int) (Math.log10(num)) + 1
    
}
