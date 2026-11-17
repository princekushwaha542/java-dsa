public class ClearRightmostSetBit {
    public static void main(String[] args) {

        int n = 40;

        int result = n & (n - 1);

        System.out.println("Original Number: " + n);
        System.out.println("After Clearing: " + result);
    }
}