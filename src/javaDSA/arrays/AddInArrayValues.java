package javaDSA.arrays;

import java.util.Arrays;

public class AddInArrayValues {
    public static void main(String[] args) {
//        int[] values = {1, 2, 3};//--> {2, 0, 0}
//        int temp = 0;
//        int right = values.length - 1;
//
//        while (right >= 0) {
//            if (right == values.length - 1) {
//                values[right] = values[right] + 1;
//            }
//            if (values[right] >= 10) {
//                values[right] = 0;
//                temp++;
//            } else if (temp > 0) {
//                if (values[right] + 1 >= 10) {
//                    values[right] = 0;
//                    temp++;
//                } else {
//                    values[right] = values[right] + 1;
//                    temp = 0;
//                }
//            } else {
//                temp = 0;
//            }
//            right--;
//        }
//        System.out.println(Arrays.toString(values));

        int[] values = {1, 9, 9}; // Expected: {2, 0, 0}
        int carry = 0;
        int right = values.length - 1;

        // Add 1 to the last element
        values[right] = values[right] + 1;

        while (right >= 0) {
            if (values[right] >= 10) {
                values[right] = 0;
                carry = 1;
                right--;
                if (right >= 0) {
                    values[right] = values[right] + carry;
                }
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(values));
    }
}
