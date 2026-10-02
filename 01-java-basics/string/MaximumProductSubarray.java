package array;

public class MaximumProductSubarray {

    public static void main(String[] args) {

        int[] arr = {2, 3, -2, 4};

        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];

            if (current < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(current, maxProduct * current);
            minProduct = Math.min(current, minProduct * current);

            result = Math.max(result, maxProduct);
        }

        System.out.println("Maximum Product: " + result);
    }
}