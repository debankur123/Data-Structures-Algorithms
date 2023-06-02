package Arrays;

import java.util.Scanner;

public class RotateArrayby1 {
    public static void main(String[] args) {
        int[] arr = getInputArray();
        int[] rotatedArray = rotateArray(arr);
        for (int j : rotatedArray) {
            System.out.print(j);
        }
    }
    public static int[] getInputArray(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int[] rotateArray(int[] arr) {
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
