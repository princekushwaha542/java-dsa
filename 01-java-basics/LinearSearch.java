import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt(); ;
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int x = sc.nextInt();


          for(int i = 0; i<arr.length; i++){
            if(arr[i]==x){
                System.out.println(arr[i]+"Value is  found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array");
    }
}