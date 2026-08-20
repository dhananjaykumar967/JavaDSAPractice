package javaOPPs.dynamicArray;

import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();// this one is dynamic as I have not defined the generics
        System.out.println(ar.size());
        ar.add(100);
        ar.add(200);
        System.out.println(ar.size());

        ar.add(300);
        ar.add(400);
        System.out.println(ar.size());

        ar.add(500);
        ar.add(600);
        System.out.println(ar.size());

        System.out.println(ar.get(0));
//        System.out.println(ar.get(8)); // Exception: IndexOutOfBoundException........
    }
}
