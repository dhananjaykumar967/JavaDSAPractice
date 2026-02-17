package javaDSA.set;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "abcbbaabcbbbcefaaf";
        Set<Character> charSet = new HashSet<>();

        for (char c : str.toCharArray()) {
            charSet.add(c);
        }
        int i = 0;
        int temp=0;
        for (Character ch : charSet) {
            for(char c:str.toCharArray()){
                if (ch.equals(c)) {
                    temp++;
                }
                if(temp>1){
                    System.out.println(ch+" "+temp);
                    temp=0;
                    break;
                }
            }

        }

        System.out.println(charSet);

    }
}
