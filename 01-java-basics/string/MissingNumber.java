package string;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {3, 0, 1};

        int n = arr.length;

        int result = n;

        for (int i = 0; i < n; i++) {
            result = result ^ i ^ arr[i];
        }

        System.out.println("Missing number: " + result);
    }
}