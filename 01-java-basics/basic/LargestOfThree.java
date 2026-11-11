package basic;

public class LargestOfThree {
    public static void main(String[] args) {

        int a = 25;
        int b = 45;
        int c = 30;

        if (a >= b && a >= c) {
            System.out.println(a + " is Largest");
        } 
        else if (b >= a && b >= c) {
            System.out.println(b + " is Largest");
        } 
        else {
            System.out.println(c + " is Largest");
        }
    }
}