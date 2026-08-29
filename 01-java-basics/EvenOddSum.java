public class EvenOddSum {
    public static void main(String[] args) {

        int[] arr = {10, 15, 8, 21, 30, 7, 12};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        int difference = evenSum - oddSum;

        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum = " + oddSum);
        System.out.println("Difference = " + difference);
    }
}