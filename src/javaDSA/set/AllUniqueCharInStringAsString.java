package javaDSA.set;

import java.util.HashSet;
import java.util.Set;

public class AllUniqueCharInStringAsString {
    public static void main(String[] args) {
        String str = "abcbbaabcbbadcefaaf";
        char[] strChar = str.toCharArray();

        StringBuilder builder = new StringBuilder();
        Set<Character> set=new HashSet<>();
        for (char ch : strChar) {

            if(!set.contains(ch)){
                builder.append(ch);
            }
            set.add(ch);

        }

        System.out.println(builder.toString());
    }
}
