public class UniqueElement {
    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 2, 4};

        int result = 0;

        for (int num : arr) {
            result = result ^ num;
        }

        System.out.println("Unique Element: " + result);
    }
}