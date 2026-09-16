package string;

public class TwoUniqueNumbers {

    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 6, 3, 2, 4, 8};

        int xor = 0;

        // Step 1: XOR all numbers
        for (int num : arr) {
            xor = xor ^ num;
        }

        // Step 2: Find rightmost set bit
        int bit = xor & -xor;

        int first = 0;
        int second = 0;

        // Step 3: Divide numbers into two groups
        for (int num : arr) {

            if ((num & bit) != 0) {
                first = first ^ num;
            } else {
                second = second ^ num;
            }
        }

        System.out.println("First unique number: " + first);
        System.out.println("Second unique number: " + second);
    }
}