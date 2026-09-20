package string;

public class SingleNumber {

    public static void main(String[] args) {

        int[] arr = {2, 2, 2, 5, 5, 5, 7};

        int result = 0;

        for (int i = 0; i < 32; i++) {

            int count = 0;

            for (int num : arr) {

                if ((num & (1 << i)) != 0) {
                    count++;
                }
            }

            if (count % 3 != 0) {
                result = result | (1 << i);
            }
        }

        System.out.println("Unique number: " + result);
    }
}