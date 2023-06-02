package Searching_Algorithms;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to be searched");
        int key = sc.nextInt();
        boolean isFound = Search(arr,key);
        if(isFound == true){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not Found");
        }
        sc.close();
    }
    public static boolean Search(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return true;
            }
        }
        return false;
    }
}
