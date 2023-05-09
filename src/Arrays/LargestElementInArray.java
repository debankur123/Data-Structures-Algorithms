package Arrays;

import java.util.Scanner;


// Optimal solution with O(N) time complexity and O(N) space complexity
public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = getInputArray();
        int resultantElement = getLargestElement(arr);
        System.out.print(resultantElement);
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
    static int getLargestElement(int[] arr){
        int largestElement = arr[0];
        for (int i=1;i<=arr.length-1;i++){
            if(arr[i] > largestElement){
                largestElement = arr[i];
            }
        }
        return largestElement;
    }
}
