package string;
public class SetBit {
    public static void main(String[] args) {

        int n = 5;
        int pos = 1;

        int bitMask = 1 << pos;

        int result = bitMask | n;

        System.out.println("Number after setting bit: " + result);
    }
} 