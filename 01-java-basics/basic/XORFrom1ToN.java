public class XORFrom1ToN {
    public static void main(String[] args) {

        int n = 10;
        int result;

        switch (n % 4) {
            case 0:
                result = n;
                break;

            case 1:
                result = 1;
                break;

            case 2:
                result = n + 1;
                break;

            default:
                result = 0;
        }

        System.out.println("XOR Result: " + result);
    }
}