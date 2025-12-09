package javaDSA.strings;

public class ReverseOnlyLetters917 {
    /**
     * Example 1:
     * <p>
     * Input: s = "ab-cd"
     * Output: "dc-ba"
     * Example 2:
     * <p>
     * Input: s = "a-bC-dEf-ghIj"
     * Output: "j-Ih-gfE-dCba"
     * Example 3:
     * <p>
     * Input: s = "Test1ng-Leet=code-Q!"
     * Output: "Qedo1ct-eeLg=ntse-T!"
     */

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    public static String reverseOnlyLetters(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        for (int i = 0; i < charArray.length; i++) {
            while (left < right && !Character.isLetter(charArray[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(charArray[right])) {
                right--;
            }
            if (left >= right) break;
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
