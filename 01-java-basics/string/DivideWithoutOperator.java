package string;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        int dividend = 43;
        int divisor = 5;

        int quotient = 0;

        while (dividend >= divisor) {

            int temp = divisor;
            int multiple = 1;

            while ((temp << 1) <= dividend) {
                temp = temp << 1;
                multiple = multiple << 1;
            }

            dividend = dividend - temp;
            quotient = quotient + multiple;
        }

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + dividend);
    }
}