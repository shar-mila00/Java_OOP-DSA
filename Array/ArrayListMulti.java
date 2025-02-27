package Array;

import java.util.*;
import java.util.ArrayList;
public class ArrayListMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        // initialization for every ArrayList element of bigger ArrayList
        for (int  i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        } 

        System.out.println(list); //empty list
        //input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);

    }
    
}
