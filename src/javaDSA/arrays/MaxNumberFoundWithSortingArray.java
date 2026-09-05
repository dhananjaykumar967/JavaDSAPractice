package javaDSA.arrays;

import java.util.Arrays;

/*Question: Find maximum number in an array with sorting the array first*/
public class MaxNumberFoundWithSortingArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 4, 7, 6, 3, 5};

        int indexPosition = findMaxValueInAnArray(arr);
        System.out.println("Maximum index value is at: " + indexPosition);

        indexPosition = alternativeWayOfFindingMaxValueInAnArray(arr);
        System.out.println("Maximum index value is at: " + indexPosition);
    }

    public static int findMaxValueInAnArray(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int alternativeWayOfFindingMaxValueInAnArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max = arr[0];
        for (int val : arr) {
            if (max < val) {
                max = val;
            }
        }
        return max;
    }
}
