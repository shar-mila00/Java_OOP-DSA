import java.util.*;

public class Array {
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        // for integer type, by default element is zero
        // array of primitives
        int[] arr = new int[5];
        System.out.println(arr[0]);
        
        // by default its null for reference type 
        String[] word = new String[4];
        System.out.println(word[0]); //an array of objects

        for (int i = 0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }

        //enhanced for loop/for-each loop
        for (int j : arr) {
            System.out.print(j + " "); // j is the reference variable, for every elelment
        }

        //convert array into a string (output in three ways)
        System.out.println();
        System.out.println(Arrays.toString(arr));

        for (int k = 0; k < word.length; k++) {
            word[k] = in.next();
        }
        System.out.println(Arrays.toString(word));

        // word[0] = "ff" changing the object
    
    }
}
