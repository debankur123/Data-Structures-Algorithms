package Arrays;
import java.util.*;

// Time complexity for this code is O(N) and space is O(1)
// Here we are using two pointers to reverse the array
// We are using the start and end pointer to swap the elements
// We are using the while loop to iterate the array and swap the elements
// We are using the temp variable to store the elements temporarily
// We are using the start and end pointer to reverse the array
// We are using the Print function to print the array elements

// Here we are using the main function to take the input from the user
// We are using the size variable to store the size of the array
// We are using the array variable to store the elements of the array
// We are using the for loop to iterate the array and store the elements
// We are using the Reverse function to reverse the array
// We are using the Print function to print the array elements

// Here we are using the Scanner class to take the input from the user
// We are using the size variable to store the size of the array
// We are using the array variable to store the elements of the array
// We are using the for loop to iterate the array and store the elements
public class Array_Reversal {
    public static void Reverse(int[] arr,int size){
        int start = 0;
        int end = size-1;
        while(start <= end){
            int temp;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void Print(int[] arr,int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        Reverse(array, size);
        Print(array, size);
        sc.close();
   }
   
}
