public class CoutSetBits {
    public static void main(String[] args){

        int n = 456 ;
        int count = 0;

        while(n > 0){
            n = n & (n - 1);
            count++;
        }
        System.out.println("Numbers of set bits: " + count);
    }
}