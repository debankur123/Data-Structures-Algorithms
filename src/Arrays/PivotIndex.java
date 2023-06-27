package Arrays;
import java.util.Scanner;

// Time complexity for this code is O(N) as for the first loop we only iterate over the array and for the second loop we also iterate over the array so the time complexity is O(N+N) = O(2N) where 2 is a constant and it can be neglected .
public class PivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int pivotIndex = pivotIndex(arr);
        System.out.println("The pivot index is "+" "+pivotIndex);
        sc.close();
    }
    public static int pivotIndex(int[] arr) {
        int sum = 0;
        int rightSum = 0;
        int leftSum = 0;
        // Calculating the total sum of the array
        for(int idx=0;idx<arr.length;idx++){
            sum+=arr[idx];
        }
        //Calculating the rightSum of the array by "rightSum=sum-arr[idx]-leftSum"
        for(int idx=0;idx<arr.length;idx++){
            rightSum=sum-arr[idx]-leftSum;
            if(rightSum==leftSum){
                return idx;
            }
            else{
                leftSum+=arr[idx];
            }
        }
        return -1;
    }
}
