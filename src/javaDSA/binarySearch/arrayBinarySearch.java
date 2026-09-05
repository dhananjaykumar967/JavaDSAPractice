package javaDSA.binarySearch;

import static java.util.Arrays.binarySearch;

public class arrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int targetElement = 7;

//        int ans = binarySearchMethod(arr, targetElement);
        int ans = binarySearch(arr, targetElement);
        System.out.println("The element is found at: " + ans);
    }

    private static int binarySearchMethod(int[] arr, int targetElement) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == targetElement) {
                return mid;
            } else if (arr[mid] < targetElement) {
                start = mid + 1;
            } else if (arr[mid] > targetElement) {
                end = mid - 1;
            }
        }
        return -1;

    }
}
