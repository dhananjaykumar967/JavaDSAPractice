package javaDSA.set;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateCharInString {
    public static void main(String[] args) {
        String str = "abcbbaabcbb";
        char[] strToChar = str.toCharArray();
        Set<Character> set = new HashSet<>();

        for (char c : strToChar) {
            if(set.contains(c)){
                System.out.println("Duplicate Character is "+c);
                break;
            }
            set.add(c);
        }
    }
}
