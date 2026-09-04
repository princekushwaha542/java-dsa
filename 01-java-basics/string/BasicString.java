package string;
import java.util.*;


public class BasicString {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String FirstName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName = FirstName + " " + lastName;
        System.out.println("Hello, " + fullName + "!");
    }
}