package javaOPPs.stringManipulation;

public class StringReverseTest {
    public static String reverseString(String s) {
        int len = s.length() - 1;
        if(s==null)
            return null;
        if (len == 1) {
            return s;
        }
        if(s.isEmpty() || s.isBlank())
            return s;

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String s = "Selenium";

//        System.out.println(reverseString("t"));
//        System.out.println(reverseString("testing"));
//        System.out.println(reverseString(null));
//        System.out.println(reverseString("testing automation"));
//        System.out.println(reverseString(""));
        System.out.println(reverseString("123"));
    }
}
