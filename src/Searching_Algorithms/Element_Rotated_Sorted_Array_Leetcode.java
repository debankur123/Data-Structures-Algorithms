import java.util.Scanner;

public class Element_Rotated_Sorted_Array_Leetcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int element = Search(arr,target);
        System.out.println("The element is at " + element);
        scanner.close();
    }
    public static int Search(int[] arr,int target){
        int pivot = PivotIndex(arr);
        if(target >= arr[pivot] && target <= arr[arr.length-1])
            //lies on 2nd line of the graph
            return BinarySearch(arr,pivot,arr.length, target);
        else
             //lies on 1st line of the graph
            return BinarySearch(arr,0,pivot-1,target);
    }
    public static int PivotIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end - start)/2;
        while(start < end){
            if(arr[mid] >= arr[0])
                start = mid+1;
            else if(arr[mid] <= arr[0])
                end = mid;
            mid = start + (end - start)/2;
        }
        return start;
    }
    public static int BinarySearch(int[] arr,int s,int e,int target){
        int start = s;
        int end = e;
        int mid = start + (end - start)/2;
        while(start <= end){
            if(arr[mid]==target)
                return mid;
            else if(target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
            mid = start + (end - start)/2;
        }
        return -1;
    }
}
