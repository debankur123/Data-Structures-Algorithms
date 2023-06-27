import java.util.Scanner;

public class Peak_In_Mountain_Leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int peakIndex = peakIndexInMountainArray(arr);
        System.out.println("Peak Index is at "+peakIndex);
        sc.close();
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        while(start < end){
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
            mid = start + (end-start)/2;
        }
        return start;
    }
}
