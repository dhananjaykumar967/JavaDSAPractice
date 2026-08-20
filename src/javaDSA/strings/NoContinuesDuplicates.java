package javaDSA.strings;

import java.util.Arrays;

public class NoContinuesDuplicates {

    public static int[] method(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (temp <= arr.length - 1)
                break;
            if (arr[i - 1] != arr[i]) {
                temp++;
                arr[temp] = arr[i];
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arry = {0, 0, 0, 1, 0, 2, 0, 3, 0, 4};

        System.out.println(Arrays.toString(method(arry)));
    }
}
