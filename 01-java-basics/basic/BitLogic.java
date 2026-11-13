public class BitLogic {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;

        System.out.println((n & 1) == 1);
        System.out.println((n & (1 << i)) == 0 ? 0 : 1);
        System.out.println(n | (1 << i));
        System.out.println(n & ~(1 << 2));
        System.out.println(n ^ (1 << i));
        System.out.println(n > 0 && (n & (n - 1)) == 0);
    }
}
