import java.util.*;

public class Print {
    public static void main(String[] args) {
        //Input
        
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter your name : ");
        String name = input.nextLine();
        System.out.println(name);
        // All data type can be taken a input from user using Scanner class
        //      int number = input.nextInt();
        //      String name = input.nextLine();   
        //      char letter = input.next().charAt(0);
        //      double preciseValue = input.nextDouble();
        //      float piValue = input.nextFloat();
        //Output

        int a = 5;
        System.out.print("Hello, Java!");
        System.out.print("The value of a is: " + a);
    }
}

