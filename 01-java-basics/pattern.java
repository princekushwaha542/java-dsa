public class pattern {
    public static void main(String[] args) {

        // Upper half
        for (int i = 1; i <= 5; i++) {

            // Left spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Left number
            System.out.print(i);

            // Middle spaces
            for (int j = 1; j <= 10 - 2 * i; j++) {
                System.out.print(" ");
            }

            // Right number
            if (i != 5) {
                System.out.print(i);
            }

            System.out.println();
        }

        // Lower half
        for (int i = 4; i >= 1; i--) {

            // Left spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Left number
            System.out.print(i);

            // Middle spaces
            for (int j = 1; j <= 10 - 2 * i; j++) {
                System.out.print(" ");
            }

            // Right number
            System.out.print(i);

            System.out.println();
        }
    }
}