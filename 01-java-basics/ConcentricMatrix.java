public class ConcentricMatrix {
    public static void main(String[] args) {
        int n = 4; 
        
        // Grid ka total size 2n - 1 hoga
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
                // Charo boundaries se distance nikalo
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                // Minimum distance find karo
                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));

                // Jo value print karni hai wo n me se minDistance minus karke aayegi
                int value = n - minDistance;
                
                System.out.print(value + " ");
            }
            // Ek row complete hone ke baad new line
            System.out.println();
        }
    }
}