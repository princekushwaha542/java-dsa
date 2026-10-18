public class f {
    public static void main(String[] args){
        int[] a = {1,2,3};
        try{
            System.out.println(a[66]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
        System.out.println("total length of array: " + a.length);
    }
}
