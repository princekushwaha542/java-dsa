public class Duplicate {
    public static void main(String[] args) {

        int[] arr = {2, 5, 3, 2, 8, 5, 9, 3, 7};

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyPrinted = false;

            // Check whether this element was already printed
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Check duplicate
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}