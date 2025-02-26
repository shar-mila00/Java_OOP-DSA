import java.util.*;
// no need mention the sizes of arrays
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax

        ArrayList<Integer> list = new ArrayList<>(5); // ArrayList <Wrapper Class> var = new ArrayList<>()
        // size mention is not mandatory

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt()); // list[ind] won't work
        }

        // output
        for (int j = 0; j < 5; j++) {
            System.out.print(list.get(j) + " ");
        }

    }
    
}
