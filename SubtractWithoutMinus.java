package string;

public class SubtractWithoutMinus {

    public static void main(String[] args) {

        int a = 15;
        int b = 6;

        while (b != 0) {

            int borrow = (~a) & b;

            a = a ^ b;

            b = borrow << 1;
        }

        System.out.println("Difference = " + a);
    }
}