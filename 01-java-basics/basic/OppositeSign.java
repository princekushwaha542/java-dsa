public class OppositeSign {
    public static void main(String[] args) {

        int a = 15;
        int b = -20;

        boolean result = (a ^ b) < 0;

        System.out.println("Opposite Signs: " + result);
    }
}