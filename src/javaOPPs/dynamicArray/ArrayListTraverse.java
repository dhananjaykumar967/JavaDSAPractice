package javaOPPs.dynamicArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTraverse {
    public static void main(String[] args) {
        ArrayList<Integer> marksList = new ArrayList<>();
        marksList.add(1900);
        marksList.add(200);
        marksList.add(300);
        marksList.add(400);

        System.out.println(marksList);
        System.out.println("================================");

        for (Integer e : marksList) {
            System.out.println(e);
        }

//        System.out.println("=============== Ascending Order =================");
//        Collections.sort(marksList);
//        System.out.println(marksList);
//
//        System.out.println("=============== Descending Order =================");
//        Collections.sort(marksList, Collections.reverseOrder());
//        System.out.println(marksList);

        Collections.swap(marksList, 0, 1); /// for swapping value of the list.
        System.out.println(marksList);

    }
}
