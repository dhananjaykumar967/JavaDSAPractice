package javaOPPs.stringManipulation;

public class StringReverseWord {

    public static String reverseString(String s) {
        int len = s.length();
        if (s == null)
            throw new NullPointerException("word can't be null");
        if (s.isBlank() || s.isEmpty())
            return s;
        if (len == 0)
            return s;

        String[] reverse = s.split("");
        int left = 0;
        int right = reverse.length - 1;
        while (left < right) {
            String temp = reverse[left];
            reverse[left] = reverse[right];
            reverse[right] = temp;
            left++;
            right--;
        }

        return String.join("", reverse);

    }

    public static String reverseWordsAtTheirOriginalPosition(String word) {
        String[] splitWord = word.split(" ");
        String rev = "";
        for (String s : splitWord) {
            rev += reverseString(s) + " ";
        }

        return rev.trim();
    }

    public static String firstLetterUppercase(String s){
        String[] sArr= s.split(" ");
        String rev = "";
        for(int i=0;i<sArr.length;i++){
            rev += sArr[i].replace(String.valueOf(sArr[i].charAt(0)),String.valueOf(sArr[i].charAt(0)).toUpperCase())+ " ";
        }

        return rev.trim();
    }

    public static void main(String[] args) {

        String s = "this is my java code";
//        System.out.println(reverseString("this"));
//        System.out.println(reverseWordsAtTheirOriginalPosition(s));// siht si ym avj edoc
        System.out.println(firstLetterUppercase(s));// siht si ym avj edoc
    }
}
