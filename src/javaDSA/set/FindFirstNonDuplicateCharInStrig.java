package javaDSA.set;

import java.util.HashSet;
import java.util.Set;

public class FindFirstNonDuplicateCharInStrig {
    public static void main(String[] args) {
        String strr = "abbcadeb";
        Set<Character> set = new HashSet<>();
        int i = 0;

        for (Character c : strr.toCharArray()) {
            set.add(c);
        }

        for (Character c : set) {
            for (Character c2 : strr.toCharArray()) {
                if (c == c2) {
                    i++;
                }
                if (i > 1){
                    i=0;
                    break;
                }
            }
        }
    }
}
