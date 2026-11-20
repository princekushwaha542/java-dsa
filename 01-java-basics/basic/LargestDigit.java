
public class LargestDigit {
    public static void main(String[] args) {

        int n = 58329;
        int max = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit > max) {
                max = digit;
            }

            n = n / 10;
        }

        System.out.println("Largest Digit = " + max);
    }
}