package javaOPPs.setConcept;

import java.util.*;

public class HashSetConcept {
    public static void main(String[] args) {
        /**
         * HashSet: Implements Set Interface which implements Collection Interface
         * 1. No Duplicates are allowed
         * 2. No insertion order
         * 3. No indexing
         * */

        Set<String> set = new HashSet<>();
        set.add("Ram");
        set.add("Mohan");
        set.add("Sohan");
        set.add("Pintu");

        set.forEach(o -> {
            if (o.equals("Pintu")) System.out.println("Hello " + o);
            else System.out.println(o);
        });

        if(set.contains("Rohan")){
            System.out.println("Rohan i s present");
        }else System.out.println("Rohan is not present");


        System.out.println("================ Using the Iterator ==============");

        Iterator<String> it1 = set.iterator();
        System.out.println(it1.next()); /// will return the next value of the iteration


        Iterator<String> it = set.iterator();
        while (it.hasNext()) ///  return true until no more element is available at the next segment.
            System.out.println(it.next());

        System.out.println("================ Set to List ==============");
        List<String> listOfSet = new ArrayList<>(set);
        System.out.println(listOfSet.get(0));

        if(listOfSet.contains("Rohan")){
            System.out.println("Rohan is present");
        }else System.out.println("Rohan is not present");

    }
}
