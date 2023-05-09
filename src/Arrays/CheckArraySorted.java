package Arrays;

import java.util.Scanner;


//Time complexity of this code is O(N) as it runs for 1 pass.
public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = getInputArray();
        int result = isSortedArray(arr);
        System.out.print(result);
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
    public static int isSortedArray(int[] arr){
        for (int i=1;i<arr.length;i++){
            if(arr[i] >= arr[i-1]){
                continue;
            }
            else {
                return 0;
            }
        }
        return 1;
    }
}
