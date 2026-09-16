package string;
import java.util.*;
public class basic {
    public static int add(int arg1, int arg2) {
        return arg1 + arg2;
    }
    public static void main(String[] args){
        System.out.println("hello test");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string");
        String str = sc.nextLine();
        System.out.println(str);

        System.out.print(add(10 ,20));
        
    }
}
