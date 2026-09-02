public class Equilibrium {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 2};

        int totalSum = 0;

        // Total sum
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {

            // Right sum = Total - Left - Current
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println("Equilibrium Index = " + i);
                break;
            }

            leftSum += arr[i];
        }
    }
}