package string;

public class StringPermutations {

    public static void main(String[] args) {

        String str = "ABC";

        generatePermutations(str, "");
    }

    static void generatePermutations(String str, String result) {

        // Base case
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Remove the selected character
            String remaining = str.substring(0, i)
                    + str.substring(i + 1);

            // Recursive call
            generatePermutations(remaining, result + ch);
        }
    }
}