package javaDSA.strings;

public class ReverseWordsInAString3WithTwoPointer {
    public static void main(String[] args) {
        String st = "Let's take LeetCode contest";
        char[] charArray = st.toCharArray();
        int start = 0;
        int left = 0;
        for (int i = 0; i <=charArray.length; i++) {
            if (left==charArray.length || charArray[i] == ' ') {
                int end = i - 1;
                reverse(charArray, start, end);
                start = i + 1;
            }
            left++;
        }
        System.out.println(new String(charArray));
    }

    public static void reverse(char[] charArray, int start, int end) {
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
    }
}
