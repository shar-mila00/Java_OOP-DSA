package Array;
import java.util.*;
import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(); //ArrayList <Wrapper Class> var = new ArrayList<>(), mentioning size not mandatory
        System.out.println(list);
        // add/input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list); // does the work of toString automatically
        System.out.println();
        
        list.add(65);
        //output
        

        //update set(index, value)
        list.set(3, 7);
        System.out.println(list);

        System.out.println(list.contains(4)); // whether contain or not

        // delete
        list.remove(4); // remove(index)
        System.out.println(list);
        
        // for getting any element
        System.out.println(list.get(2));  
    }
}
