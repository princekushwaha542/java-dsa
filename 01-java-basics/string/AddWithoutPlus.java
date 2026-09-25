package string;

public class AddWithoutPlus {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        while (b != 0) {

            int carry = (a & b) << 1;

            a = a ^ b;
            b = carry;
        }

        System.out.println("Sum = " + a);
    }
}