package string;

public class UniqueNumberr {
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        int result = 0;

        for (int num : arr) {
            result = result ^ num;
        }

        System.out.println("Unique Number = " + result);
    }
}