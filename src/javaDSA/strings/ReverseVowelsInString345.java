package javaDSA.strings;

public class ReverseVowelsInString345 {
    // Input: s = "IceCreAm"
    // Output: "AceCreIm"
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(new ReverseVowelsInString345().reverseVowelsString(s));
    }

    public boolean isVowel(char c){
        c=Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }

    public boolean reverseVowelsString(String s) {
        char[] charArray=s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            while(left<right && !isVowel(charArray[left])){
                left++;
            }
            while(left<right && !isVowel(charArray[right])){
                right--;
            }
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(charArray));
        return false;
    }
}
