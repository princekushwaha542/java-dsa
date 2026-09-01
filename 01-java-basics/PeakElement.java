public class PeakElement {
    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        for (int i = 0; i < arr.length; i++) {

            // First element
            if (i == 0 && arr[i] >= arr[i + 1]) {
                System.out.println("Peak Element = " + arr[i]);
                break;
            }

            // Last element
            if (i == arr.length - 1 && arr[i] >= arr[i - 1]) {
                System.out.println("Peak Element = " + arr[i]);
                break;
            }

            // Middle element
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                System.out.println("Peak Element = " + arr[i]);
                break;
            }
        }
    }
}