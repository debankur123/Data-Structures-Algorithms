package Arrays;

import java.util.Scanner;
public class ArrayInput{
    public static void main(String[] args){
        int[] arr = getInputArray();
        printArray(arr);
    }
    public static int[] getInputArray(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of Array :");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("The element at" + i + "th position is" + arr[i]);
        }
    }
}
