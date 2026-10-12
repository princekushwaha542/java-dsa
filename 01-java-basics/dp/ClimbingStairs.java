package dp;

public class ClimbingStairs {

    public static void main(String[] args) {

        int n = 5;

        if (n <= 0) {
            System.out.println("Invalid number of stairs");
            return;
        }

        int first = 1;
        int second = 1;

        for (int i = 2; i <= n; i++) {

            int current = first + second;

            first = second;
            second = current;
        }

        System.out.println("Total Ways = " + second);
    }
}