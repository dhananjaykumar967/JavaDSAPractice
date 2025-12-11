package javaDSA.miscellaneous;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrence {
    public static void main(String[] args) {
        System.out.println(oddOccurrence(new int[]{1, 2, 3, 2, 3, 1, 3}));
    }

    public static int oddOccurrence(int[] arr) {
        int oddValue = 0;
        Set<Integer> uniqueSet = new HashSet<>();
        for (int i : arr)
            uniqueSet.add(i);
        for (int i : uniqueSet) {
            for (int k : arr) {
                if (k == i) {
                    oddValue++;
                }
            }
            if (oddValue % 2 != 0) {
                return i;
            }
            oddValue = 0;
        }
        return 0;
    }
}
