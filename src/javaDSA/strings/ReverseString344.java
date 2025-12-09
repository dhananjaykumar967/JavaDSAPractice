package javaDSA.strings;

public class ReverseString344 {
    // Input: s = ["h","e","l","l","o"]
    // Output: ["o","l","l","e","h"]
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        new ReverseString344().reverseString(s);
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(s.toString());
    }
}
