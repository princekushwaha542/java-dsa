package array;

public class MaximumSubarraySuma {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid window size");
            return;
        }

        int windowSum = 0;

        // Calculate the first window sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum + arr[i] - arr[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}