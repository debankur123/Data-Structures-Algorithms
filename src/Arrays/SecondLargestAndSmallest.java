package Arrays;

import java.util.Arrays;
import java.util.Scanner;


// Time complexity for secondLargest is O(N) and space is O(1)
// Time complexity of secondSmallest is O(N) and space is O(1).
// Total Time complexity is O(N+N) = O(2N)
public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = getInputArray();
        int[] resultantArray = secondOrderElements(arr);
        System.out.print(Arrays.toString(resultantArray));
    }
    public static int[] secondOrderElements(int[] arr){
        int secondLargest = getSecondLargestElement(arr);
        int secondSmallest = getSecondSmallestElement(arr);
        return new int[] {secondLargest,secondSmallest};
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
    static int getSecondLargestElement(int[] arr){
        int largest = arr[0];
        int slargest = -1;
        for (int i=1;i<arr.length;i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] >slargest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }
    static int getSecondSmallestElement(int[] arr){
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for (int i=1;i<arr.length;i++){
            if(arr[i] < smallest){
                sSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < sSmallest) {
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }
}
