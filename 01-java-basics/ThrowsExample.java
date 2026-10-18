public class ThrowsExample {
    
    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("not eligible to vote");
        } else {
            System.out.println("eligible to vote");
        }
    }

    public static void main(String[] args) {
        
        checkAge(15); 
        
    }
}
