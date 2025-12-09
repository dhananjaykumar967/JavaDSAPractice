package javaDSA.strings;

public class IsSubsequence392 {

    /**
     * Example 1:
     * <p>
     * Input: s = "abc", t = "ahbgdc"
     * Output: true
     * Example 2:
     * <p>
     * Input: s = "axc", t = "ahbgdc"
     * Output: false
     */

    public static void main(String[] args) {
        System.out.println(new IsSubsequence392().isSubsequence("abc", "ahbgdc"));
        System.out.println(new IsSubsequence392().isSubsequence("axc", "ahbgdc"));
        System.out.println(new IsSubsequence392().isSubsequence("", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        int sStart = 0;
        int tStart = 0;

        if (sLength == 0) {
            return true;
        }

        while (sStart < sLength && tStart < tLength) {
            if (s.charAt(sStart) == t.charAt(tStart)) {
                sStart++;
            }
            tStart++;
            if (sStart == sLength) {
                return true;
            }
        }
        return false;
    }
}
