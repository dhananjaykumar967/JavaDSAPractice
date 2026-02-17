package javaDSA.set;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordOnly {
    public static void main(String[] args) {
        int[] intArr = {3, 7, 53, 7, 3, 53};

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();

        int r = 0;
        for (Integer i : intArr) {
            if (hashSet.contains(i)) {
                duplicateSet.add(i);
            } else {
                hashSet.add(i);
            }
            r++;
        }
        System.out.println(duplicateSet);
    }
}
