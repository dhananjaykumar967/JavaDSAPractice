package javaDSA.arrays;

public class ReverseKeepSpecialCharIntact {

    public static void main(String args[]) {
        String text = "Test@123#";
        char[] ch = text.toCharArray();
        int left = 0, right = ch.length - 1;

        while (left < right) {
            if(ch[left]=='#' || ch[left]== '@'){
                left++;
            }
            if(ch[right]=='#' || ch[right]== '@'){
                right--;
            }else{
                char temp= ch[right]; //temp- 3
                ch[right]= ch[left]; // right- T
                ch[left]=temp;// left-3
                left++;
                right--;
            }
        }
//        String x= new String(ch);
        String.valueOf(ch);
        System.out.println(String.valueOf(ch));
    }
}
