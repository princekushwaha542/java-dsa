package string;

import java.util.*;

public class ReverseBits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = 0;

        for (int i = 0; i < 32; i++) {

            int bit = n & 1;

            result = (result << 1) | bit;

            n = n >> 1;
        }

        System.out.println("Reversed bits: " + result);
    }
}