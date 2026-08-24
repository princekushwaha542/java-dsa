public import java.util.*;

public class Armstrong {

    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is Armstrong");
        } else {
            System.out.println(num + " is not Armstrong");
        }
    }
} {
    
}
