package javaDSA.strings;

public class CountCharactersExcludeSpaces {
    public static int charCountExcludingSpaces(String text) {
        if (text == null) throw new NullPointerException("Null value not allowed");
        int temp = 0;
        int count = 0;
        while (temp < text.length()) {
            if (Character.isLetter(text.charAt(temp))) {
                temp++;
                count++;
            } else temp++;
        }
        return count ;
    }

    public static void main(String[] args) {
        String str = "My name is Dhananjay";
        int count = charCountExcludingSpaces(str);
        System.out.println(count);
    }
}
