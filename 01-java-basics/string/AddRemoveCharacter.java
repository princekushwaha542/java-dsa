package string;
import java.util.Scanner;

public class AddRemoveCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Add character
        System.out.print("Enter character to add: ");
        char addChar = sc.next().charAt(0);

        System.out.print("Enter position: ");
        int addPosition = sc.nextInt();

        String newString = "";

        for (int i = 0; i < str.length(); i++) {

            if (i == addPosition) {
                newString = newString + addChar;
            }

            newString = newString + str.charAt(i);
        }

        // If position is at the end
        if (addPosition == str.length()) {
            newString = newString + addChar;
        }

        System.out.println("After Add: " + newString);

        // Remove character
        System.out.print("Enter position to remove: ");
        int removePosition = sc.nextInt();

        String result = "";

        for (int i = 0; i < newString.length(); i++) {

            if (i != removePosition) {
                result = result + newString.charAt(i);
            }
        }

        System.out.println("After Remove: " + result);
    }
}