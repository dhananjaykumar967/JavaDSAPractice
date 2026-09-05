package javaDSA.strings;

public class StringBuilderReverseString {

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        String reversedString = reverseString(s);
        System.out.println(reversedString);
    }

}
