public class TwoOddNumbers {
    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 2, 4, 5, 3, 7};

        int xor = 0;

        for (int num : arr) {
            xor ^= num;
        }

        int setBit = xor & -xor;

        int num1 = 0;
        int num2 = 0;

        for (int num : arr) {
            if ((num & setBit) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
    }
}