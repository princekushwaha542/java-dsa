package string;

import java.util.*;

public class UpdateBit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        System.out.print("Enter new bit (0 or 1): ");
        int newBit = sc.nextInt();

        int bitMask = 1 << pos;

        if (newBit == 1) {
            n = n | bitMask;
        } else {
            n = n & (~bitMask);
        }

        System.out.println("Updated number: " + n);
    }
}