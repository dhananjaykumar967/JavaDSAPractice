package javaOPPs.dynamicArray;

import java.util.ArrayList;

public class ArrayListGenerics {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();// this one is dynamic as I have not defined the generics
        System.out.println(ar.size());
        ar.add(100);
        ar.add(200);
        System.out.println(ar.size());

        /**
         * ArrayList is a order based collection----
         * The default virtual capacity is 10 always then increases with a Load Factor formula = Current Physical Capacity / 2= result added to the further
         * */
        ArrayList<Integer> integerArrayList = new ArrayList();// now this is type safe
        integerArrayList.add(40);
        integerArrayList.add(400);
        integerArrayList.add(490);
        System.out.println(integerArrayList.size());
        System.out.println(integerArrayList.get(0));

        ArrayList<String> stringArrayList = new ArrayList();
        stringArrayList.add("Ramesh");
        stringArrayList.add("Suresh");
        stringArrayList.add("Mahesh");
        System.out.println(stringArrayList.size());
        System.out.println(stringArrayList.get(0));

        ArrayList<Double> doublesArrayList = new ArrayList();
        doublesArrayList.add(34.5);
        doublesArrayList.add(656.9);
        doublesArrayList.add(76.54);
        System.out.println(doublesArrayList.size());
        System.out.println(doublesArrayList.get(0));


    }
}
