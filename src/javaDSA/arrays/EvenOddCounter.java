package javaDSA.arrays;

public class EvenOddCounter {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15, 18};

        evenOddCounterMethod(arr);
    }

    private static void evenOddCounterMethod(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Array is empty");
        int evenCounter = 0;
        int oddCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) continue;
            if (arr[i] % 2 == 0) {
                evenCounter++;
                System.out.println("Even Number: " + arr[i]);
            } else {
                oddCounter++;
                System.out.println("Odd Number: " + arr[i]);
            }
        }

        System.out.println("Even number count is: " + evenCounter + " Odd number count is: " + oddCounter);
    }
}
