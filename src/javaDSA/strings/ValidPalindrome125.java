package javaDSA.strings;

public class ValidPalindrome125 {
    public static void main(String[] args) {
        System.out.println(new ValidPalindrome125().isPalindrome(".,"));
    }

    public boolean isPalindrome(String s) {

//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(charArray[left])) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(charArray[right])) {
                right--;
            }
            if (charArray[left] != charArray[right]) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
