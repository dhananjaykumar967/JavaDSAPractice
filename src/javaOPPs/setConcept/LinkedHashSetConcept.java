package javaOPPs.setConcept;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcept {
    public static void main(String[] args) {

        /**
         * LinkedHashSet:
         * 1. Maintain the insertion order unlike HashSet
         *
         * */
        Set<String> linkedHashSet = new LinkedHashSet<>(); /// maintains the insertion order
        linkedHashSet.add("Rohit Sharma");
        linkedHashSet.add("Shubhman Gill");
        linkedHashSet.add("Virat Kohili");
        linkedHashSet.add("Shreyas Iyyer");
        linkedHashSet.add("Ishan Kishan");
        linkedHashSet.add("Tilak Verma");
        linkedHashSet.add("Hardik Pandaya");
        linkedHashSet.add("Kuldeep Yadav");
        linkedHashSet.add("Mohamad Shami");
        linkedHashSet.add("Md Siraj");
        linkedHashSet.add("Jasprit Bumrah");

        ///
        System.out.println("Due to insertion order maintained with LinkedHashSet " + linkedHashSet);


        linkedHashSet = new HashSet<>(linkedHashSet);
        System.out.println("As HashSet do not maintain insertion order " + linkedHashSet);

    }
}
