package string;

public class UniqueNumber {

    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 2, 4};

        int result = 0;

        for (int num : arr) {
            result = result ^ num;
        }

        System.out.println("Unique number: " + result);
    }
}