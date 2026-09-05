package javaDSA.slidingWindow;

public class FirstProgram {

    public static void useSlidingWindowsTechnique(int[] arr, int days) {
        int sum = 0;
        for (int i = 0; i < days; i++) {
            sum += arr[i];
        }
        int avg = sum / days;
        System.out.println("First sum value is: " + sum);
        System.out.println("First " + days + " average is: " + avg);
        for (int i = 1; i <= arr.length - days; i++) {
            sum = sum - arr[i - 1] + arr[i + days - 1];
            System.out.println("Sum value is for next " + days + " is: " + sum);
            avg = sum / days;
            System.out.println("Next " + days + " average is: " + avg);
        }
    }

    public static void main(String[] args) {
        int[] users = {100, 48, 82, 57, 34, 112, 65};
        int days = 3;
        System.out.println();
        useSlidingWindowsTechnique(users, days);
    }
}
