package javaDSA.strings;

public class ReverseWordsInAString3557 {
    public static void main(String[] args) {
        String st = "Let's take LeetCode contest";
        String[] stArray = st.split(" ");
        StringBuilder result = new StringBuilder();
        for (String text : stArray) {
            char[] textArray = text.toCharArray();
            for (int i = 0, j = textArray.length - 1; i < j; i++, j--) {
                char temp = textArray[i];
                textArray[i] = textArray[j];
                textArray[j] = temp;
            }
            result.append(textArray).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
