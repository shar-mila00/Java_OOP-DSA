import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][2]; // columns may be given or not

        int[][] b = {
            {1, 2, 3},
            {4,5},
            {5, 6, 7, 8}
        }; // each array of different size is an object itself 

        System.out.println(b.length); // array length : no of rows
        System.out.println(b[1].length); //length of column of a particular row
        
        // input
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        
        System.out.println();
        // output by enhanced for loop : for (datatype (of elements in array) any reference var : var of main array)

        for (int[] i : a) {
            System.out.println(Arrays.toString(i)); // every element of array is itself an array, i refers to every object
        
        }

    }
}
