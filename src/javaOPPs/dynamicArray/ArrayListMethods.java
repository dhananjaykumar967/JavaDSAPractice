package javaOPPs.dynamicArray;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> markList = new ArrayList<>();

        markList.add(90);
        markList.add(80);
        markList.add(77);
        markList.add(32);
        markList.add(87);

        /// With the use of Object, we can easily remove the exact value else by default .remove() only takes index value
        markList.remove((Object)90);

        System.out.println(markList);
        markList.remove(3);
        System.out.println(markList);
        markList.add(1, 78); /// It simply put the value at index and all further indexed value shift at their next indexes.
        /// markList.add(1, 78); also ensures that the size of the list get increased as indexed value shift at their next indexes.
        System.out.println(markList);
        System.out.println(markList.size());

        markList.set(2, 56);/// It simply replaces the value at 2nd index position, thus no shift of element to next subsequent index
        System.out.println(markList);

        markList.remove(3); /// It will remove any value present at 3rd index position and also shrink the size by 1.
        System.out.println(markList);
    }
}
