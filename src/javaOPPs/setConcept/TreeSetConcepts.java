package javaOPPs.setConcept;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetConcepts {
    public static void main(String[] args) {
        /**
         * TreeSet implements SortedSet interface -> which implements Set interface
         * 1. null is not allow in TreeSet: Because null sorting is impossible.
         * 2. It maintains the sorting if starts with -> special chars ->  Numeric First -> Capital letter -> small letter
         * */
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Rohit Sharma");
        treeSet.add("Shubhman Gill");
        treeSet.add("Virat Kohili");
        treeSet.add("Shreyas Iyyer");
        treeSet.add("Ishan Kishan");
        treeSet.add("aaaaTilak Verma");
        treeSet.add("Hardik Pandaya");
        treeSet.add("Kuldeep Yadav");
        treeSet.add("Mohamad Shami");
        treeSet.add("123 Siraj");
        treeSet.add("#Jasprit Bumrah");

        System.out.println(treeSet);
    }
}
