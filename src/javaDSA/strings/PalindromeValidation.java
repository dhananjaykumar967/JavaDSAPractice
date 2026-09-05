package javaDSA.strings;

public class PalindromeValidation {
    public static boolean isPalindromeOrNot(String text) {
        if (text.equals(null)) throw new NullPointerException("Null value is not allowed");

        int startIndex = 0;
        int endIndex = text.length() - 1;
        while (startIndex < endIndex) {
            if (text.charAt(startIndex) != text.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "madam";
        System.out.println(isPalindromeOrNot(text));
    }
}
