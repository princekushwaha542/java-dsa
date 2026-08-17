public class ButterflyPattern{
    public static void main(String[] arguments) {

        // Upper half
        for (int i = 9; i >= 1; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int k = 1; k <= 18 - 2 * i; k++) {
                System.out.print(" ");
            }

            // Right stars
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = 2; i <= 9; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int k = 1; k <= 18 - 2 * i; k++) {
                System.out.print(" ");
            }

            // Right stars
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}