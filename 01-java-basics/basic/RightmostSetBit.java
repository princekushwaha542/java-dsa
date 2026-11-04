public class RightmostSetBit {
    public static void main(String[] args) {

        int n = 40;

        int position = 1;

        while ((n & 1) == 0) {
            n = n >> 1;
            position++;
        }

        System.out.println("Rightmost set bit position: " + position);
    }
}